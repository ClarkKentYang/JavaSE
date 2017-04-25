package com.milan.listener;

import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;

public class Person implements HttpSessionBindingListener{

	private String username;
	private int age;
	

	
	public Person(String username, int age) {
		super();
		this.username = username;
		this.age = age;
	}


	@Override
	public String toString() {
		return "Person [username=" + username + ", age=" + age + "]";
	}

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

	@Override
	public void valueBound(HttpSessionBindingEvent arg0) {
		System.out.println("person:valueBound");
	}

	@Override
	public void valueUnbound(HttpSessionBindingEvent arg0) {
		System.out.println("person:valueUnbound");
	}

}
