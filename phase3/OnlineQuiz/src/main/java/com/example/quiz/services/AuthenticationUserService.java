package com.example.quiz.services;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.quiz.entity.User;
import com.example.quiz.exceptions.UserNotFoundException;
import com.example.quiz.repositories.AuthenticationUserRepository;

@Service
public class AuthenticationUserService {
	@Autowired
	AuthenticationUserRepository authRepo;

	public User GetUserByName(String name) {
		Optional<User> userfound = authRepo.findUserByName(name);
		if (userfound.isPresent()) {
			return userfound.get();
		} else {
			throw new UserNotFoundException();

		}
	}
	public Boolean isValidPassword(String cmp, String actual) {
		return ((cmp.equals(actual)) ? true : false);
	}

}
