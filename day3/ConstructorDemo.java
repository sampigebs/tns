package com.tns.day3;

import java.util.Scanner;

public class ConstructorDemo {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	System.out.println("enetr the id");
	int Id =sc.nextInt();
		//System.out.println(Id);
		
	System.out.println("enetr the name");
	String name =sc.next();
//		//System.out.println(name);
		System.out.println("enter the city");
		String city=sc.next();
		//System.out.println(city);
Customer c1 = new Customer();
		c1.setCustomerCity(city);
	c1.getCustomerCity();
		c1.setCustomerID(Id);
		c1.getCustomerID();
		c1.setCustomerName(name);
		c1.getCustomerName();
	System.out.println(c1);
	
Customer c2 = new Customer(10,"mirza","bangalore");
		System.out.println(c2);
}}