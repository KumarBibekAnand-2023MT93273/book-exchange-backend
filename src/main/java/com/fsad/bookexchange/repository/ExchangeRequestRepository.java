package com.fsad.bookexchange.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fsad.bookexchange.entity.ExchangeRequest;

@Repository
public interface ExchangeRequestRepository extends JpaRepository<ExchangeRequest, Long> {

}
