package com.tns.day4;

public class Person {

	private String name;
	private String city;
	
	
	public Person(String name, String city) {
	
		this.name = name;
		this.city = city;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", city=" + city + "]";


	
	}
	
	
}


