package com.project.quiz.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.project.quiz.exceptions.QuizNotFoundException;

@ControllerAdvice
public class QuizExceptionController {

	@ExceptionHandler(value = QuizNotFoundException.class)
	public ResponseEntity<Object> handleException(QuizNotFoundException ex) {
		return new ResponseEntity<Object>(ex.getMessage(), HttpStatus.NOT_FOUND);
	}

}
