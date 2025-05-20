package com.tns.day4;

public class Student extends Citizen
{
private int rollno;
private String collegename;

//default constructor

//public Student()
//{
//	super();
//}

//parameterized contructor

public Student(String name, String address, int phno, int aadarno, int rollno, String collegename) {
	super(name, address, phno, aadarno);
	this.rollno = rollno;
	this.collegename = collegename;
}

public int getRollno() {
	return rollno;
}

public void setRollno(int rollno) {
	this.rollno = rollno;
}

public String getCollegename() {
	return collegename;
}

public void setCollegename(String collegename) {
	this.collegename = collegename;
}

@Override
public String toString() {
	return "Student [rollno=" + rollno + ", collegename=" + collegename + ", getName()=" + getName() + ", getAddress()="
			+ getAddress() + ", getPhno()=" + getPhno() + ", getAadarno()=" + getAadarno() + "]";
}


}
