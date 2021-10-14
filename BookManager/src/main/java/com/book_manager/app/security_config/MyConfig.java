package com.book_manager.app.security_config;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
@Configuration
@EnableWebSecurity
public class MyConfig extends WebSecurityConfigurerAdapter {

	
	@Bean
	public UserDetailsService getUserDetailsService() {
		
		return new UserDetailsServiceImpl();
	}

@Bean
 public BCryptPasswordEncoder passwordEncoder() {
	 return new BCryptPasswordEncoder();
 }

@Bean
public DaoAuthenticationProvider authenticationProvider() {
	
	DaoAuthenticationProvider dap=new DaoAuthenticationProvider();
	
	dap.setUserDetailsService(getUserDetailsService());
	dap.setPasswordEncoder(passwordEncoder());
	
	return dap;
}

public void configure(AuthenticationManagerBuilder auth) {
	auth.authenticationProvider(authenticationProvider());
}

public void configure(HttpSecurity http) throws Exception {
	http.authorizeRequests().antMatchers("/admin/**").hasRole("ADMIN")
	.antMatchers("/index/**").hasRole("USER").
	antMatchers("/**").permitAll().and().formLogin().loginPage("/signin")
	.defaultSuccessUrl("/index/")
	.failureUrl("/singin-fail")
	
	.and().csrf().disable();

}

}
