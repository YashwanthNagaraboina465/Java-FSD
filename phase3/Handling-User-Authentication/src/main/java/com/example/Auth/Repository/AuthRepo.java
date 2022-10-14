package com.example.Auth.Repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.Auth.entity.UserEntity;

@Repository
public interface AuthRepo extends CrudRepository<UserEntity, Integer> {

	 Optional<UserEntity> findUserByName(String name);
}
