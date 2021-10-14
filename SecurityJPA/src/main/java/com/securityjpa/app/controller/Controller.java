package com.securityjpa.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@GetMapping("/")
	public String handler1() {
		
		return "ALL";
	}
	
	@GetMapping("/user")
	public String handler2() {
		
		return "USER";
	}
	
	
	@GetMapping("/admin")
	public String handler3() {
		
		return "ADMIN";
	}
	
	
	
}
