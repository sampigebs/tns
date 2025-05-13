//Program to define Customer Entity
package com.tns.fooddeliverysystem.entities;

public class Customer extends User {
 private Cart cart;

 public Customer(int userId, String username, long contactNo) {
     super(userId, username, contactNo);
     this.cart = new Cart();
 }

 public Cart getCart() {
     return cart;
 }
}
