//Program to define OrderService class
package com.tns.onlineshopping.services;

import java.util.ArrayList;
import java.util.List;
import com.tns.onlineshopping.entities.Order;
import com.tns.onlineshopping.entities.Product;
import com.tns.onlineshopping.entities.ProductQuantityPair;

public class OrderService {
 private List<Order> orderList = new ArrayList<>();
private int orderId;

 public void addOrder(Order order) {
     orderList.add(order);
 }

 public void updateOrderStatus(int orderId, String status) {
     Order order = getOrder(orderId);
     if (order == null) {
         System.out.println("Order not found.");
         return;
     }

     if ("Completed".equalsIgnoreCase(status)) {
         for (ProductQuantityPair pair : order.getProducts()) {
             Product product = pair.getProduct();
             int quantity = pair.getQuantity();
             if (product.getStockQuantity() >= quantity) {
                 product.setStockQuantity(product.getStockQuantity() - quantity);
             } else {
                 System.out.println("Insufficient stock for product: " + product.getName());
                 return;
             }
         }
     } else if ("Cancelled".equalsIgnoreCase(status)) {
         if ("Completed".equalsIgnoreCase(order.getStatus()) || "Pending".equalsIgnoreCase(order.getStatus())) {
             for (ProductQuantityPair pair : order.getProducts()) {
                 Product product = pair.getProduct();
                 int quantity = pair.getQuantity();
                 product.setStockQuantity(product.getStockQuantity() + quantity);
             
         }
     }
     } else if ("Delivered".equalsIgnoreCase(status) && "Completed".equalsIgnoreCase(order.getStatus())) {
         // Only update status to Delivered, no stock adjustment needed
         order.setStatus(status);
     } else 
         System.out.println("Invalid Order");
     }

 int parsedOrderId = orderId; // ✅ no need to parse if it's already an int

 public Order getOrder(int orderId) {
	 return orderList.stream()
			    .filter(order -> order.getOrderId().equals(String.valueOf(orderId)))
			    .findFirst()
			    .orElse(null);


 }

 public List<Order> getOrders() {
     return orderList;
 }

public void placeOrder(Order order) {
	// TODO Auto-generated method stub
	
}
}
