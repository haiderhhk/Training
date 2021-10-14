package com.restapi.app.controller;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.restapi.app.dao.BooksDao;
import com.restapi.app.entity.Books;

@RestController
public class Controller {
	
	
	
	
	@GetMapping("/test") public String handler() {
		
		  return "Testing"; }
	
	
	
	
	/*
	 * @GetMapping("/test") public String handler() {
	 * 
	 * return "Testing"; }
	 * 
	 * 
	 * @GetMapping("/books") public List<Books> AllBooks() { return
	 * dao.getAllBooks(); }
	 * 
	 * 
	 * 
	 * @GetMapping("/books/{id}") public Books IdBooks(@PathVariable("id") int id) {
	 * return dao.getIdBooks(id); }
	 * 
	 * 
	 * 
	 * @PostMapping("/books") public String AddBook(@RequestBody Books book) {
	 * 
	 * System.out.println(book); dao.addBook(book); return "Added Successfully"; }
	 * 
	 * 
	 * 
	 * @DeleteMapping("/books/{id}") public String DeleteBook(@PathVariable("id")
	 * int id) {
	 * 
	 * dao.deleteBook(id); return "Deleted Successfully"; }
	 */

}
