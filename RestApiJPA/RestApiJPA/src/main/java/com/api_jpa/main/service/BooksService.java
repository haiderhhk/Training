package com.api_jpa.main.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api_jpa.main.entity.Books;
import com.api_jpa.main.repository.Repository;

@Service
public class BooksService {

	@Autowired
	private Repository repo;
	
	
	public List<Books> getallBooks(){
		
		return (List<Books>) repo.findAll();
	}
	
	
	public Optional<Books> getIdBooks(int id){
		
		return repo.findById(id);
		}
	
	
	public void addBook(Books book) {
		repo.save(book);
		
	}
	
	
	
	
	public void deleteBook(int id) {
		
		repo.deleteById(id);
	}
	
}
