package com.fsad.bookexchange.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.fsad.bookexchange.entity.Profile;

public interface ProfileRepository extends JpaRepository<Profile, Long> {
    Profile findByUserId(Long userId);
}
