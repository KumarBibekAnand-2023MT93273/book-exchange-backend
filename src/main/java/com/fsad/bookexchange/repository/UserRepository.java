package com.fsad.bookexchange.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fsad.bookexchange.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
