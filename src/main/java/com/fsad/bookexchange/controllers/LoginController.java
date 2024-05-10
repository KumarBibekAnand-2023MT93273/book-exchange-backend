package com.fsad.bookexchange.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fsad.bookexchange.entity.User;
import com.fsad.bookexchange.model.LoginRequest;
import com.fsad.bookexchange.repository.UserRepository;

@CrossOrigin("*")
@RestController
@RequestMapping("/api")
public class LoginController {
    
    @Autowired
    private UserRepository userRepository;
    
    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody LoginRequest loginRequest) {
        String username = loginRequest.getUsername();
        String password = loginRequest.getPassword();
        
        User user = userRepository.findByUsername(username);
        if (user != null && user.getPassword().equals(password)) {
            return new ResponseEntity<>(user, HttpStatus.OK);
        } else {
        	return new ResponseEntity<>("Invalid username or password",HttpStatus.UNAUTHORIZED);
        }
    }
}
