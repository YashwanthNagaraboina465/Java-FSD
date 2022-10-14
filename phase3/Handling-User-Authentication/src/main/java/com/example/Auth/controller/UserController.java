package com.example.Auth.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.Auth.Service.AuthenticationService;
import com.example.Auth.entity.UserEntity;



@Controller
@RequestMapping("/User")
public class UserController {
	
	
	@Autowired
	AuthenticationService authService;

	@GetMapping("/Auth")
	public String showLogin() {
		return "auth";
	}

	@PostMapping("/Auth")
	@ResponseBody
	public String authenticateUser(@RequestParam("username") String username, @RequestParam("password") String password) {
		UserEntity user = authService.GetUserByName(username);
		String smt = (authService.isValidPassword(password, user.getPassword())) ? "success" : "failure";
		return smt;
	}  
} 

