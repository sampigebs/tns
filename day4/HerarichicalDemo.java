package com.tns.day4;

public class HerarichicalDemo {
 
public static void main(String[] args) {
		
		
	//main
	
			Person p;
			p = new Person("kartik","bangalore");
			System.out.println(p);
			p=new Student1("8th sem",78.98f,"kartik","bangalore");//dynamic binding
			System.out.println(p);
			p=new Employee("kartik","bangalore",121,3456f,"cse");
			System.out.println(p);
		}

	
	}


