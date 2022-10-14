package com.samples.CRUD;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;


@Component("kk")
public class DAOimple implements DAO{
	
	@Autowired
	private JdbcTemplate jdtmp;

	

	@Override
	public int create(Employee employee) {
		String sql="insert into employee values(?,?,?)";
		int result = jdtmp.update(sql , employee.getId(),employee.getFirstname(),employee.getLastname());
		return result;
	}

	

}
