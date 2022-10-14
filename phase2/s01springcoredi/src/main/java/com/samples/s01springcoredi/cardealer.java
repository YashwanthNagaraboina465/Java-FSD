package com.samples.s01springcoredi;

import java.util.Map;
import java.util.Set;

public class cardealer {
	
	private String name;
	
	private Map<Integer,String> cars;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Map<Integer, String> getCars() {
		return cars;
	}

	public void setCars(Map<Integer, String> cars) {
		this.cars = cars;
	}

	@Override
	public String toString() {
		return "cardealer [name=" + name + ", cars=" + cars + "]";
	}

	public cardealer() {
		super();
	}

	
}
