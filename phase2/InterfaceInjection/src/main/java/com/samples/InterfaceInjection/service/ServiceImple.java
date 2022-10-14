package com.samples.InterfaceInjection.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.samples.InterfaceInjection.DAO;
import com.samples.InterfaceInjection.Service;

@Component
public class ServiceImple implements Service {

	@Autowired
	private DAO d;
	
	public DAO getD() {
		return d;
	}

	public void setD(DAO d) {
		this.d = d;
	}

	@Override
	public void m2() {
		System.out.println("inside service");
		d.m1();
	}



}
