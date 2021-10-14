package com.api_jpa.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.api_jpa.main.entity.Books;
import com.api_jpa.main.service.BooksService;

@RestController
public class Controller {
	
	@Autowired
	BooksService dao;
	
	
	@GetMapping("/test")
	public String testHandler() {
		return "testing from RestApiJpa";
	}

	
	@GetMapping("/books")
	public List<Books> AllBooks() {
		
		
		return dao.getallBooks();

	}
	
	
	@GetMapping("/books/{id}")
	public Books IdBooks(@PathVariable("id") int id ) {
		
		
		return dao.getIdBooks(id).get();
	}
	
	
	@PostMapping("/books")
	public String AddBook(@RequestBody Books b) {
		
		dao.addBook(b);
		return "Added Successfully";

	}
	
	
	
	
	@DeleteMapping("/books/{id}")
	public String DeleteBook(@PathVariable("id") int id) {
		
		dao.deleteBook(id);
		return "Deleted Successfully";

	}
	
	
}
