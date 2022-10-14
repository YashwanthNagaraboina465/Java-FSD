package com.project.quizuser.Repo;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.project.quizuser.entity.User;

public interface UserRepository extends CrudRepository<User, Integer> {

	Optional<User> findByNameAndPassword(String name, String password);

}
