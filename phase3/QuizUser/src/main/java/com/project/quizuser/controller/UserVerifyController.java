package com.project.quizuser.controller;

import java.util.Optional;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.project.quizuser.Repo.UserRepository;
import com.project.quizuser.entity.User;
import com.project.quizuser.exceptions.UserNotFoundException;

@Controller
@RequestMapping("/verifyuser")
public class UserVerifyController {

	@Autowired
	UserRepository repo;

	@RequestMapping("/userLogin")
	public String showLoginPage() {
		return "UserLogin";
	}

	@RequestMapping(value = "/userloginverify", method = RequestMethod.POST)
	@ResponseBody
	public String ValidateAdmin(HttpServletRequest request) {

		String username = request.getParameter("name");
		String password = request.getParameter("password");
		Optional<User> optproduct = repo.findByNameAndPassword(username, password);
		if (optproduct.isEmpty()) {
			throw new UserNotFoundException(username, password);
		}

		return "Login Successful";
	}

}
