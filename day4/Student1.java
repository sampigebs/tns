package com.tns.day4;

public class Student1  extends Person{

	private String clas;
	private float per;
	
	public Student1(String clas, float per,String name, String city) 
	{
		super(name,city);
		this.clas = clas;
		this.per = per;
	}
	
	
	public String getClas() {
		return clas;
	}
	public void setClas(String clas) {
		this.clas = clas;
	}
	public float getPer() {
		return per;
	}
	public void setPer(float per) {
		this.per = per;
	}


	@Override
	public String toString() {
		return "Student1 [clas=" + clas + ", per=" + per + ", getName()=" + getName() + ", getCity()=" + getCity()
				+ "]";
	}
	
	

	
	
	
	
	
}

