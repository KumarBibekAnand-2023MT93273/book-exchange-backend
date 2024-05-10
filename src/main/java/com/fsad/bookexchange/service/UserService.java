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
		return userRepository.save(user);
	}


	public boolean isUserNameAlreadyExists(String username) {
		User user = userRepository.findByUsername(username);
        if(user != null) {
        	return true;
        }
        return false;
	}
}
