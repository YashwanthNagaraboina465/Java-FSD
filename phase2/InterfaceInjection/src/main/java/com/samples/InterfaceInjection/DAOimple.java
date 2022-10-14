package com.samples.InterfaceInjection;

import org.springframework.stereotype.Component;

@Component
public class DAOimple implements DAO{

	@Override
	public void m1() {
	System.out.println("inside the DAOImple");
		
	}

}
