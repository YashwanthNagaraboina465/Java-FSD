package com.example.quiz.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.quiz.entity.Admin;
import com.example.quiz.entity.User;

@Repository
public interface AuthenticationUserRepository extends CrudRepository<User, Integer>{
	
	public Optional<User> findUserByName(String name);

	public Admin save(Admin admin);

}
