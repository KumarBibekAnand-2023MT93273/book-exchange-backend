package com.fsad.bookexchange.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fsad.bookexchange.entity.Message;
import com.fsad.bookexchange.repository.MessageRepository;

@Service
public class MessageService {

	@Autowired
	private MessageRepository msgRepository;
	

	public Message addMessage(Message msg) {
		
		return msgRepository.save(msg);
	}


	public List<Message> getMessage(String recepientId) {
		
		return msgRepository.getAllMessagesById(recepientId);
	}

}
