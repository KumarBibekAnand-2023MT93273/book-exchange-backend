package com.fsad.bookexchange.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fsad.bookexchange.entity.User;
import com.fsad.bookexchange.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	public List<User> getUsers() {
		return userRepository.findAll();
		
	}

	public User addUser(User user) {
		// TODO Auto-generated method stub
		return userRepository.save(user);
	}
}
