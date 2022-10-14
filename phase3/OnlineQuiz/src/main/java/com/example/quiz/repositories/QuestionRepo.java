package com.example.quiz.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.quiz.entity.Question;

@Repository
public interface QuestionRepo extends JpaRepository<Question, Integer> {
	
	Optional<Question> findByQuesId(int quesId);

}
