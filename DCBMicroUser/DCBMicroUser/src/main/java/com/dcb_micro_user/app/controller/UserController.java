package com.dcb_micro_user.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dcb_micro_user.app.entity.User;
import com.dcb_micro_user.app.service.UserService;
import com.dcb_micro_user.app.valueobject.RestTemplateVo;

@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	UserService service;
	
	@GetMapping("/allusers")
	public List<User> getAllUsers(){
		
		return service.getAllUser();
	}

	@GetMapping("/{id}")
	public RestTemplateVo getIdUsers(@PathVariable("id") int id){
		
		return service.getIdUser(id);
	}


}
