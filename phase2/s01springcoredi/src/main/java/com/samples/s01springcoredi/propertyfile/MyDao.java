package com.samples.s01springcoredi.propertyfile;

public class MyDao {
	
	private String user;
	private String password;
	public MyDao(String user, String password) {
		super();
		this.user = user;
		this.password = password;
	}
	@Override
	public String toString() {
		return "MyDao [user=" + user + ", password=" + password + "]";
	}
	

}
