package com.project.quiz.Repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.project.quiz.entity.Admin;

public interface AdminRepository extends CrudRepository<Admin, Integer> {

	Optional<Admin> findByAdminnameAndPassword(String name, String password);

}