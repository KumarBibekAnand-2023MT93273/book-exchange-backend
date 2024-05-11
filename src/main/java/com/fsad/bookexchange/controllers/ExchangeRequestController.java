package com.fsad.bookexchange.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fsad.bookexchange.entity.ExchangeRequest;
import com.fsad.bookexchange.service.ExchangeRequestService;

@CrossOrigin("*")
@RestController
@RequestMapping("/api")
public class ExchangeRequestController {
	
	@Autowired
	private ExchangeRequestService exchangeReqService;
	
	@GetMapping("/exchange-requests/{userId}")
	public List<ExchangeRequest> getExchangeRequests(@PathVariable Long userId){
		return exchangeReqService.getExchangeRequests(userId);
		
	}
	
	@PostMapping("/exchange-requests")
	public ExchangeRequest storeExchangeRequests(@RequestBody ExchangeRequest exchangeReq){
		return exchangeReqService.exchangeRequest(exchangeReq);
		
	}
	
	// Endpoint to accept an exchange request
	  @PutMapping("/exchange-requests/{requestId}/accept")
	  public ResponseEntity<?> acceptExchangeRequest(@PathVariable Long requestId) {
		  exchangeReqService.acceptExchangeRequest(requestId);
	    return new ResponseEntity<>(HttpStatus.OK);
	  }

	  // Endpoint to mark an exchange request as complete
	  @PutMapping("/exchange-requests/{requestId}/complete")
	  public ResponseEntity<?> completeExchangeRequest(@PathVariable Long requestId) {
		  exchangeReqService.completeExchangeRequest(requestId);
	    return new ResponseEntity<>(HttpStatus.OK);
	  }

}
