//Base class for Users
package com.tns.fooddeliverysystem.entities;

public class User {
 private int userId;
 private String username;
 private long contactNo;

 public User(int userId, String username, long contactNo) {
     this.userId = userId;
     this.username = username;
     this.contactNo = contactNo;
 }

 public int getUserId() {
     return userId;
 }

 public String getUsername() {
     return username;
 }

 public long getContactNo() {
     return contactNo;
 }
}
