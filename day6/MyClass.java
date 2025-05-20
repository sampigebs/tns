package com.tns.day6;

public class MyClass {

	private int section;//non static variables
	private static int srNo;
	//static block

	static
	{
		System.out.println("within static block");
		srNo=1000;
		//section = 10;//in static block cannot declare non static variables
	}

	//default constructor
		MyClass()
		{
			System.out.println("--------------Within Default Constructor-----------");
			srNo++;
			section++;		
		}

		@Override
		public String toString() {
			return "MyClass [Serial No "+srNo+",section=" + section + "]";
		}
	//static method
		
		static void display()
		{
			//System.out.println("section is"+section);//no access for non static variables
			System.out.println("serial no is"+srNo);
		}
		
	
}
