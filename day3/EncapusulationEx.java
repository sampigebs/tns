package com.tns.day3;

public class EncapusulationEx {

	
		// TODO Auto-generated method stub
private int serialNum;
private String name;
private int age;
 
//getter and setter using to access as public

public int getSerialNum() {
	return serialNum;
}
public void setSerialNum(int serialNum) {
	this.serialNum = serialNum;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}

@Override
public String toString() //used to print from obj to string type
{
	return "EncapusulationEx [serialNum=" + serialNum + ", name=" + name + ", age=" + age + "]";
}
	

}
