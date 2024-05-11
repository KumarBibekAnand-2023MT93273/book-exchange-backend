package com.fsad.bookexchange.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fsad.bookexchange.entity.Profile;
import com.fsad.bookexchange.repository.ProfileRepository;

@Service
public class ProfileService {
    

    @Autowired
    private ProfileRepository profileRepository;
    
    public Profile saveProfile(Profile profile) {
        return profileRepository.save(profile);
    }

    public Profile getProfileByUserId(Long userId) {
        return profileRepository.findByUserId(userId);
    }
}
