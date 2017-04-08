package com.milan.reflex;

public class ReflexTest {
	public static void main(String[] args) {
		try {
			Class clazz = Class.forName("com.milan.reflex.Person");
			Person p = (Person) clazz.newInstance();
			p.sayhello();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
