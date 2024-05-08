package com.fsad.bookexchange.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fsad.bookexchange.entity.Message;
import com.fsad.bookexchange.service.MessageService;

@RestController
@RequestMapping("/api")
public class MessageController {
	
	@Autowired
	private MessageService msgService;
	
	@PostMapping("/message")
	public Message addMessages(@RequestBody Message msg) {
		return msgService.addMessage(msg);
	}
	
	@GetMapping("/message")
	public List<Message> getMessage(@PathVariable String recepientId) {
		return msgService.getMessage(recepientId);
	}
}
