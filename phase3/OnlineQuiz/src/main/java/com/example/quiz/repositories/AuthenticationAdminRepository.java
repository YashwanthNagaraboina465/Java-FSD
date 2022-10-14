package com.example.quiz.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.quiz.entity.Admin;

@Repository
public interface AuthenticationAdminRepository extends CrudRepository<Admin, Integer>{
	public Optional<Admin> findAdminByName(String name);

}