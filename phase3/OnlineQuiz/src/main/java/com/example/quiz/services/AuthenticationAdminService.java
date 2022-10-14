package com.example.quiz.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.quiz.entity.Admin;
import com.example.quiz.exceptions.AdminNotFoundException;
import com.example.quiz.repositories.AuthenticationAdminRepository;

@Service
public class AuthenticationAdminService {
	
	@Autowired
	AuthenticationAdminRepository adminAuthRepo;

	
	public Admin GetAdminByName(String name) {
		Optional<Admin> adminfound = adminAuthRepo.findAdminByName(name);
		if(adminfound.isPresent()) {
			return adminfound.get();
		}
		else {
			throw new AdminNotFoundException();
		}
	}
	
	
	
	public Boolean isValidPassword(String cmp, String actual) {
		return ((cmp.equals(actual)) ?  true :  false);	
	}

}
