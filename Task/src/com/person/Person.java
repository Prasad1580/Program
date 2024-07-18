package com.person;

public class Person {
	
	String name;
	int age;
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public static void main(String[] args) {
		Person p = new Person("Sam", 24);
		System.out.println("the name is "+ p.name + " " + "and age is" +" " + p.age );
	}
	
}


