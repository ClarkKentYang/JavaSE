package com.milan.reflex;

public class Person {

	private String username;
	private int age;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public void sayhello(){
		System.out.println("hello world");
	}
	
	
}
