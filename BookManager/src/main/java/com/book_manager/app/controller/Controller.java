package com.book_manager.app.controller;

import java.security.Principal;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.book_manager.app.entity.User;
import com.book_manager.app.repositoy.UserRepositoy;

@org.springframework.stereotype.Controller
public class Controller {

	@Autowired
	UserRepositoy repo;

	@Autowired
	BCryptPasswordEncoder password_encoder;

	@RequestMapping("/index")
	public String handler(Principal principal,Model model,HttpSession session) {
		
	User user= repo.findByUserEmail(principal.getName());
	System.out.println(user);
	
	//model.addAttribute("user", user);
	session.setAttribute("user",user);
	return "index";
	}

	@RequestMapping("/register")
	public String Register(HttpSession session) throws Exception {
		
		
		User user=(User)session.getAttribute("user");
		if(session.getAttribute("user")!=null) {
			throw new Exception();
		}
		
		
		return "register";
	}

	@PostMapping("/registerUser")
	public String registerUser(@ModelAttribute User user, Model model) {
		
		try {
		System.out.println("I reg user");
		user.setUserPassword(password_encoder.encode(user.getUserPassword()));
		System.out.println(user);

		user.setUserRole("ROLE_USER");
		repo.save(user);
		model.addAttribute("reg_msg", "registerd successfully");
		}catch(Exception e){
			model.addAttribute("reg_msg", "registerd failed");
		}
		
		return "register";
	}

	
	  @GetMapping("/signin")
	  public String login(Model model,HttpSession session) {
	  System.out.println("In login user");
	  
	  session.removeAttribute("user");
	  
	  model.addAttribute("msg","");
	  
	  return "login"; }
	  
	  
	  @GetMapping("/singin-fail")
	  public String loginFail(Model model) {
	  System.out.println("In login Fail user");
	  
	 model.addAttribute("msg", "login failed!");
	  
	  return "login"; 
	  }
	  

	 

}
