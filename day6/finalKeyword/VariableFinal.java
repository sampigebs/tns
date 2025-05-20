package com.tns.day6.finalKeyword;

public class VariableFinal {

	//final int x;
		final int x=100;//during declaration give value
		final static int Y;//blank final static
		final static int Z=10;//declaration
		
		void change()
		{
			x=30;//reassign value
			Y=200;//reassign
		}
		@Override
		public String toString() {
			return "FinalVariable [x=" + x + ", Y" + Y + "]";
		}
	static
	{
		Y=20;
		Z=100;//re initialization
		System.out.println(Y);
	}
}
