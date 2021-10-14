package com.securityjpa.app.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

public class SecurityConfig extends WebSecurityConfigurerAdapter{

	
	
	UserDetailsService userDetailsService;
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		// TODO Auto-generated method stub
		auth.userDetailsService(userDetailsService);
	}



	
	protected void configure(HttpSecurity http) throws Exception {
		// TODO Auto-generated method stub
		
		http.authorizeRequests().
		antMatchers("/admin").hasRole("ADMIN").
		antMatchers("/user").hasAnyRole("USER","ADMIN").
		antMatchers("/").permitAll().
		and().formLogin();
	
	}
	
	
	
	
	
	@SuppressWarnings("deprecation")
	@Bean
	public PasswordEncoder getEncoder() {
		
		return NoOpPasswordEncoder.getInstance();
	}


}
