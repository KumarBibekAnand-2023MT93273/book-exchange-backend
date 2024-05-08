package com.fsad.bookexchange.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fsad.bookexchange.entity.Profile;
import com.fsad.bookexchange.repository.ProfileRepository;

@Service
public class ProfileService {

	@Autowired
	private ProfileRepository profileRepository;
	
	public Optional<Profile> getProfile(Long userId) {
		return profileRepository.findById(userId);
		
	}

	public Profile addOrUpdateProfile(Profile profile) {
		return profileRepository.save(profile);
	}

}
