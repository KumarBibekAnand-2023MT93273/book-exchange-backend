package com.fsad.bookexchange.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fsad.bookexchange.entity.User;
import com.fsad.bookexchange.service.UserService;

@CrossOrigin("*")
@RestController
@RequestMapping("/api")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/users")
	public List<User> getUsers() {
		return userService.getUsers();
	}
	

	@PostMapping("/users")
	public ResponseEntity<?> addUsers(@RequestBody User user) {
		if (userService.isUserNameAlreadyExists(user.getUsername())) {
            return new ResponseEntity<>("UserName already exists- try with different username!", HttpStatus.BAD_REQUEST);
        }		
		
		return new ResponseEntity<>(userService.addUser(user), HttpStatus.CREATED);
	}
	

}
