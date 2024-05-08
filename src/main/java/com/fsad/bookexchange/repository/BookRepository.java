package com.fsad.bookexchange.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fsad.bookexchange.entity.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {

}
