package com.chatbox.T3ChatBox.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/chatbox")
public class Controller {
	@Value("${server.port}")
	String port;
	
	@GetMapping("/checkport")
	public String handler() {
		
		
		return port;
		
	}
	
	
}
