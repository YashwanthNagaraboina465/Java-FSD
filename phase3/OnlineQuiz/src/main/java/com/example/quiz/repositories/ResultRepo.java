package com.example.quiz.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.quiz.entity.Result;

@Repository
public interface ResultRepo extends JpaRepository<Result, Integer> {
	
}
