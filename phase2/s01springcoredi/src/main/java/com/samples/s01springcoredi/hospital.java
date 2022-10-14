package com.samples.s01springcoredi;

import java.util.List;

public class hospital {
	
	private String name;
	private List<String> dept;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getDept() {
		return dept;
	}
	public void setDept(List<String> dept) {
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "hospital [name=" + name + ", dept=" + dept + "]";
	}
	public hospital(String name, List<String> dept) {
		super();
		this.name = name;
		this.dept = dept;
	}
	public hospital() {
		super();
	}

}
