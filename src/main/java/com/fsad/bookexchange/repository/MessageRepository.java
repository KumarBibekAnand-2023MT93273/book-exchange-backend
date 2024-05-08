package com.fsad.bookexchange.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.fsad.bookexchange.entity.Message;

public interface MessageRepository extends JpaRepository<Message, Long> {
    
    @Query("SELECT m FROM Message m WHERE m.recepientId = :recepientId")
    List<Message> getAllMessagesById(@Param("recepientId") String recepientId);
}
