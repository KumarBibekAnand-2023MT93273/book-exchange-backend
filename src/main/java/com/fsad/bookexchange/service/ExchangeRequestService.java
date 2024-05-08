package com.fsad.bookexchange.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fsad.bookexchange.entity.ExchangeRequest;
import com.fsad.bookexchange.repository.ExchangeRequestRepository;

@Service
public class ExchangeRequestService {

	@Autowired
	private ExchangeRequestRepository exchangeReqRepository;
	
	public List<ExchangeRequest> getExchangeRequests() {
		return exchangeReqRepository.findAll();
		
	}

	public ExchangeRequest exchangeRequest(ExchangeRequest exchangeReq) {
		return exchangeReqRepository.save(exchangeReq);
	}

}
