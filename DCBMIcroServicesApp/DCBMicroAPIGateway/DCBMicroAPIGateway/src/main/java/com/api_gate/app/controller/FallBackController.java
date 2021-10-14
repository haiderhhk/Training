package com.api_gate.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackController {

	@GetMapping("/fallbackuser")
	public	String FallBackHandlerUSER() {
		
		return "USER is taken for time to load than expected";
	}
	
	@GetMapping("/fallbackdept")
	public	String FallBackHandlerDEPT() {
		
		return "DEPT is taken for time to load than expected";
	}
}
