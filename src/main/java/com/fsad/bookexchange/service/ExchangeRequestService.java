package com.fsad.bookexchange.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fsad.bookexchange.entity.ExchangeRequest;
import com.fsad.bookexchange.exceptions.ResourceNotFoundException;
import com.fsad.bookexchange.repository.ExchangeRequestRepository;

@Service
public class ExchangeRequestService {

	@Autowired
	private ExchangeRequestRepository exchangeReqRepository;
	
	public List<ExchangeRequest> getExchangeRequests(Long userId) {
		return exchangeReqRepository.findByUserId(userId);
		
	}

	public ExchangeRequest exchangeRequest(ExchangeRequest exchangeReq) {
		return exchangeReqRepository.save(exchangeReq);
	}

	public void acceptExchangeRequest(Long requestId) {
	    ExchangeRequest request = exchangeReqRepository.findById(requestId)
	    		.orElseThrow(()-> new ResourceNotFoundException("Exchange request not found with id: " + requestId));
	    request.setStatus("Accepted");
	    exchangeReqRepository.save(request);
	}

	public void completeExchangeRequest(Long requestId) {
	    ExchangeRequest request = exchangeReqRepository.findById(requestId)
	        .orElseThrow(() -> new ResourceNotFoundException("Exchange request not found with id: " + requestId));
	    request.setStatus("Completed");
	    exchangeReqRepository.save(request);
	}


}
