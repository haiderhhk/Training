package com.restapi.app.dao;

import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.restapi.app.entity.Books;
import com.restapi.app.repository.BooksRepo;

import java.util.*;

@Component
public class BooksDao {
	
	
	@Autowired
	private BooksRepo repo;
	
	/*
	 * @Autowired BooksRepo booksRepo;
	 * 
	 * 
	 * 
	 * public List<Books> getBooks() {
	 * 
	 * booksRepo.save(new Books(114,"Nausea","Sartre"));
	 * 
	 * List<Books> all_books=(List<Books>) booksRepo.findAll();
	 * 
	 * return all_books; }
	 */
	
	
	
	/*
	 * private List <Books> books=List.of(new Books(114,"Nausea","Sartre"), new
	 * Books(115,"Ambiguity","Simone"), new Books(116,"Stranger","Camus"), new
	 * Books(117,"Republic","Plato") );
	 * 
	 * 
	 * 
	 * 
	 * public List<Books> getAllBooks(){
	 * 
	 * return books;
	 * 
	 * }
	 * 
	 * public Books getIdBooks(int id){
	 * 
	 * 
	 * for(Books i:books) {
	 * 
	 * if(i.getId()==id) { return i; }
	 * 
	 * }
	 * 
	 * return books.get(1);
	 * 
	 * }
	 * 
	 * 
	 * public void addBook(Books b) {
	 * 
	 * books=books.stream().filter(i->i.getId()!=0).collect(Collectors.toList());
	 * books.add(b); }
	 * 
	 * 
	 * public void deleteBook(int id) {
	 * 
	 * books=books.stream().filter(i->i.getId()!=id).collect(Collectors.toList());
	 * 
	 * }
	 */
	
}
