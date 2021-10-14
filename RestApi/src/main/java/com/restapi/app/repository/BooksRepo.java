package com.restapi.app.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.restapi.app.entity.Books;

public interface BooksRepo extends CrudRepository<Books, Integer> {

}
