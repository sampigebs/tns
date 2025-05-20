package com.tns.day7;

public class MethodOverloadingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("the addition of two no"+MethodOverloading.addition(19, 20));
		System.out.println("the addition of three no"+MethodOverloading.addition(19, 20,30));
		System.out.println("the addition of two float no"+MethodOverloading.addition(12.3f,87.6f));
		System.out.println("the addition of int and float no"+MethodOverloading.addition(19,34.5f));
		Point p;
		p=new Point();
		System.out.println(p);
System.out.println(p);
		p=new Point(12.7f);
		System.out.println(p);
		p=new Point(12.3f,14.5f);
		System.out.println(p);
	}
}