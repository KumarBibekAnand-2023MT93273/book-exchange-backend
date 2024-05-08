package com.fsad.bookexchange.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fsad.bookexchange.entity.Profile;

@Repository
public interface ProfileRepository extends JpaRepository<Profile, Long> {

}
