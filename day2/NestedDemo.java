package com.tns.day2;

public class NestedDemo{
public static void main(String[] args)
{
	 int a=10,b=30,c=15;
	 
	 if(a>b)  //10>30// failed
	 { 
	if(a>c)
	 System.out.println("a is printed"); 
	else System.out.println("c is printed");
	 } 
	else 
	if(c>b)//15>30 
	System.out.println("c is printed");
	else
	 System.out.println("b is printed");

}}
	 
