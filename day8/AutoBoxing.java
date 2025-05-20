package com.tns.day8;
import java.util.ArrayList;
public class AutoBoxing {

	public static void main(String[] args) {
		
		char ch = 'a';  
		
		Character a  = ch; //auto boxing primitive data
		
		ArrayList<Integer> arraylist = new ArrayList<Integer>();
		
		arraylist.add(24);
		
		System.out.println(arraylist);
	}
}
