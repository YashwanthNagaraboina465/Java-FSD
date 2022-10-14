package com.example.quiz.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.example.quiz.exceptions.AdminNotFoundException;

@ControllerAdvice
public class AdminNotFoundExceptionController {

	@ExceptionHandler(value=AdminNotFoundException.class)
	public ResponseEntity<Object> handleException(AdminNotFoundException ex) {
		return new ResponseEntity<Object>(ex.getMessage(), HttpStatus.NOT_FOUND);
	}
	
}
