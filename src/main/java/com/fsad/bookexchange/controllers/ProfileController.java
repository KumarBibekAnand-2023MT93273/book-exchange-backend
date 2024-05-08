package com.fsad.bookexchange.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fsad.bookexchange.entity.Profile;
import com.fsad.bookexchange.service.ProfileService;

@RestController
@RequestMapping("/api")
public class ProfileController {
	
	@Autowired
	private ProfileService profileService;

	@GetMapping("/profile")
	public Optional<Profile> getProfileData(@PathVariable Long userId) {
		return profileService.getProfile(userId);
	}
	
	@PostMapping("/profile")
	public Profile addBooks(@RequestBody Profile profile) {
		return profileService.addOrUpdateProfile(profile);
	}
}
