package com.samples.springmvcorm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.samples.springmvcorm.dao.UserDao;

@Component
public class UserServiceImpl implements UserDao {
	@Autowired
	private UserDao userdao;
	

}
