package com.milan.listener;

import java.io.Serializable;

import javax.servlet.http.HttpSessionActivationListener;
import javax.servlet.http.HttpSessionEvent;

public class Student implements Serializable,HttpSessionActivationListener{
	
	private String username;
	private int age;
	

	
	public Student(String username, int age) {
		super();
		this.username = username;
		this.age = age;
	}


	@Override
	public String toString() {
		return "Student [username=" + username + ", age=" + age + "]";
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
	public void sessionDidActivate(HttpSessionEvent arg0) {
		System.out.println("Student：活化");
	}

	@Override
	public void sessionWillPassivate(HttpSessionEvent arg0) {
		System.out.println("Student：钝化");
	}

}
