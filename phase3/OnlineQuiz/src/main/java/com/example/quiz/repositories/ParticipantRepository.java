package com.example.quiz.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.quiz.entity.QuizParticipant;

@Repository
public interface ParticipantRepository extends CrudRepository<QuizParticipant, Integer>{
	
}
