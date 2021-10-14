package com.book_manager.app.repositoy;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.book_manager.app.entity.User;

@Repository
public interface UserRepositoy extends JpaRepository<User, String>{

	
	public User findByUserEmail(String userEmail);
}
