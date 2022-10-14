package com.project.quiz.Repository;

import org.springframework.data.repository.CrudRepository;

import com.project.quiz.entity.Quiz;

public interface QuizRepository extends CrudRepository<Quiz, Integer> {

}