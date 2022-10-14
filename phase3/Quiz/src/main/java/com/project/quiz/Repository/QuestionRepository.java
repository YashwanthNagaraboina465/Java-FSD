package com.project.quiz.Repository;

import org.springframework.data.repository.CrudRepository;

import com.project.quiz.entity.Questions;

public interface QuestionRepository extends CrudRepository<Questions, Integer> {

}
