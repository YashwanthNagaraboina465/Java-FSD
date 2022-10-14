package com.project.quiz.exceptions;

public class QuizNotFoundException extends RuntimeException {
	
	public QuizNotFoundException(int id) {
		super("Quiz with id " + id + " not found.");
	}


}
