package com.securityjpa.app.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.securityjpa.app.entity.User;


@Component
public interface UserRepo extends JpaRepository<User, Integer>{

	public Optional<User> findByUserName(String name);
	
}
