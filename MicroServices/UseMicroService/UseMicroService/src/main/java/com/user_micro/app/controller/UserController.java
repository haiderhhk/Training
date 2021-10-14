package com.user_micro.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.user_micro.app.entity.User;
import com.user_micro.app.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {


    @Autowired
    private UserService userService;

    @Autowired
    private RestTemplate restTemplate;
	
    @GetMapping("/test")
    public String testHandler() {
    	
    	return "testing";
    }
    
    @GetMapping("/{userId}")
    public User getUser(@PathVariable("userId") Long userId) {

        User user = this.userService.getUser(userId);
        //http://localhost:8052/contact/user/1311

        List contacts= restTemplate.getForObject("http://localhost:8052/contact/user/"+userId, List.class)
        ;
		 
        user.setContacts(contacts);
        return user;

    }

}
