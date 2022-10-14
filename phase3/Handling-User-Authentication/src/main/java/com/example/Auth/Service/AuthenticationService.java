package com.example.Auth.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Auth.Repository.AuthRepo;
import com.example.Auth.entity.UserEntity;
import com.example.Auth.exception.UserNotFoundExceptions;

@Service
public class AuthenticationService {

	@Autowired
	private AuthRepo repo;

	public UserEntity GetUserByName(String name) {
		Optional<UserEntity> found = repo.findUserByName(name);
		if (found.isPresent())
			return found.get();
		else
			throw new UserNotFoundExceptions();
	}

	public Boolean isValidPassword(String Comp, String actual) {
		return ((Comp.equals(actual)) ? true : false);
	}

}
