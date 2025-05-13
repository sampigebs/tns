package com.tns.onlineshopping.entities;

import java.util.ArrayList;
import java.util.List;

public class Order {

	public String getOrderId() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getUsername() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object getCustomer() {
		// TODO Auto-generated method stub
		return null;
	}

	public ProductQuantityPair[] getProducts() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getStatus() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setStatus(String status) {
		// TODO Auto-generated method stub
		
	}

	public void addProduct(Product product, int quantity) {
		// TODO Auto-generated method stub
		
	}
	private int orderId;
	private Customer customer;
	private String status;
	private List<ProductQuantityPair> products;

	public Order(int orderId, Customer customer) {
	    this.orderId = orderId;
	    this.customer = customer;
	    this.status = "Pending"; // Or default status
	    this.products = new ArrayList<>();
	}


}
