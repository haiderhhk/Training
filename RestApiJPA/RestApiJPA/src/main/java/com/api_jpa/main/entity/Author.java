package com.api_jpa.main.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.hibernate.annotations.ManyToAny;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
public class Author {
	
	@Id
	int  aid;
	String name;
	
	@OneToOne(mappedBy = "author")
	@JsonBackReference
	Books book;

	public int getAid() {
		return aid;
	}

	public void setAid(int aid) {
		this.aid = aid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Books getBook() {
		return book;
	}

	public void setBook(Books book) {
		this.book = book;
	}

	public Author(int aid, String name, Books book) {
		super();
		this.aid = aid;
		this.name = name;
		this.book = book;
	}

	public Author() {
		super();
	}

	@Override
	public String toString() {
		return "Author [aid=" + aid + ", name=" + name + ", book=" + book + "]";
	}
}
