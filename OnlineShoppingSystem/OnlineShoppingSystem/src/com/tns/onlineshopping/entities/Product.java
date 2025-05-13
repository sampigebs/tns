//Program to define Product class
package com.tns.onlineshopping.entities;

public class Product {
 private int productId;
 private String name;
 private double price;
 private int stockQuantity;

 public Product(int productId, String name, double price, int stockQuantity) {
     this.productId = productId;
     this.name = name;
     this.price = price;
     this.stockQuantity = stockQuantity;
 }

 // Getters and setters
 public int getProductId() {
     return productId;
 }

 public void setProductId(int productId) {
     this.productId = productId;
 }

 public String getName() {
     return name;
 }

 public void setName(String name) {
     this.name = name;
 }

 public double getPrice() {
     return price;
 }

 public void setPrice(double price) {
     this.price = price;
 }

 public int getStockQuantity() {
     return stockQuantity;
 }

 public void setStockQuantity(int stockQuantity) {
     this.stockQuantity = stockQuantity;
 }

 @Override
 public String toString() {
     return "Product [productId=" + productId + ", name=" + name + ", price=" + price + ", stockQuantity=" + stockQuantity + "]";
 }
}
