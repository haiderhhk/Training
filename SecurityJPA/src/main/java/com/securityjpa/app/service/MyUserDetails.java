package com.securityjpa.app.service;
import java.util.*;
import java.util.stream.Collectors;

import org.apache.catalina.User;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
public class MyUserDetails implements UserDetails {
	
	String username;
	String password;
	boolean active;
	List<GrantedAuthority> authorties;
	
	public MyUserDetails(User user) {
		super();
		this.username = user.getUsername();
		this.password = user.getPassword();
		this.active = true;
		this.authorties =Arrays.asList(new SimpleGrantedAuthority("ROLE_USER"));
				
				
				/*Arrays.stream(user.getRoles().split(","))
				
				.map(SimpleGrantedAuthority::new)
				.collect(Collectors.toList())
				;*/
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		return this.authorties;
	}

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return this.password;
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return this.username;
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return false;
	}

}
