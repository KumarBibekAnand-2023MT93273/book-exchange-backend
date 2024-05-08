package com.fsad.bookexchange.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fsad.bookexchange.entity.ExchangeRequest;
import com.fsad.bookexchange.service.ExchangeRequestService;

@RestController
@RequestMapping("/api")
public class ExchangeRequestController {
	
	@Autowired
	private ExchangeRequestService exchangeReqService;
	
	@GetMapping("/exchange-requests")
	public List<ExchangeRequest> getExchangeRequests(){
		return exchangeReqService.getExchangeRequests();
		
	}
	
	@PostMapping("/exchange-requests")
	public ExchangeRequest storeExchangeRequests(@RequestBody ExchangeRequest exchangeReq){
		return exchangeReqService.exchangeRequest(exchangeReq);
		
	}

}
