package com.Collecters;

public class Person {

	String name;
	
	String country;

	public Object salary;

	public Person(String name, String country) {
		this.name = name;
		this.country = country;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", country=" + country + "]";
	}
	
}
