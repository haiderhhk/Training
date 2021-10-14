package com.api_jpa.main.repository;

import org.springframework.data.repository.CrudRepository;

import com.api_jpa.main.entity.Books;

public interface Repository extends CrudRepository<Books, Integer> {

}
