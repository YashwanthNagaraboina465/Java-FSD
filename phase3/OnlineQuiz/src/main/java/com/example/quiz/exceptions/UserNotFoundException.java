package com.example.quiz.exceptions;

public class UserNotFoundException extends RuntimeException {
	public UserNotFoundException() {
		super("Invalid username or password");
	}
}
