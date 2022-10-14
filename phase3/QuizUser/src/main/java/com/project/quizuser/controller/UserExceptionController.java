package com.project.quizuser.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.project.quizuser.exceptions.UserNotFoundException;

@ControllerAdvice
public class UserExceptionController {

	@ExceptionHandler(value = UserNotFoundException.class)
	public ResponseEntity<Object> handleException(UserNotFoundException ex) {
		return new ResponseEntity<Object>(ex.getMessage(), HttpStatus.NOT_FOUND);
	}

}