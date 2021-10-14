package com.book_manager.app.security_config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.book_manager.app.entity.User;
import com.book_manager.app.repositoy.UserRepositoy;

public class UserDetailsServiceImpl implements UserDetailsService{

	@Autowired
	UserRepositoy repo;
	@Override
	public UserDetails loadUserByUsername(String useremail) throws UsernameNotFoundException {
		
		
		User user=repo.findByUserEmail(useremail);
		
		if(user==null) {
			throw new UsernameNotFoundException("Not found");
		}
		
		CustomUserDetails custom_user_details=new CustomUserDetails(user);
		return custom_user_details;
	}

}
