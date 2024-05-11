package com.fsad.bookexchange.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fsad.bookexchange.entity.Book;
import com.fsad.bookexchange.service.BookService;

@CrossOrigin("*")
@RestController
@RequestMapping("/api")
public class BookController {
	
	@Autowired
	private BookService bookService;

	@GetMapping("/books")
	public List<Book> getBooks() {
		return bookService.getBooks();
	}
	
	@PostMapping("/books")
	public Book addBooks(@RequestBody Book book) {
		return bookService.addBook(book);
	}
}
