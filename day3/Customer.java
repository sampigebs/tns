package com.tns.day3;

public class Customer 
{
private int customerID;
private String customerName;
private String customerCity;

public Customer()
{
	System.out.println("iam a default constructor");
}

//parameterised

public Customer(int customerID, String customerName, String customerCity) {
	
	this.customerID = customerID;
	this.customerName = customerName;
	this.customerCity = customerCity;
}

//getter and setter
public int getCustomerID() {
	return customerID;
}
public void setCustomerID(int customerID) {
	this.customerID = customerID;
}
public String getCustomerName() {
	return customerName;
}
public void setCustomerName(String customerName) {
	this.customerName = customerName;
}
public String getCustomerCity() {
	return customerCity;
}
public void setCustomerCity(String customerCity) {
	this.customerCity = customerCity;
}
@Override
public String toString() {
	return "Customer [customerID=" + customerID + ", customerName=" + customerName + ", customerCity=" + customerCity
			+ "]";
}

}

