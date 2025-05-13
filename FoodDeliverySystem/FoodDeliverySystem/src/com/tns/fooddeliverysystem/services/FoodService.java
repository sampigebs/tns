//Program to define FoodService class to manage the food services: add, remove, retrieve food items
package com.tns.fooddeliverysystem.services;

import java.util.ArrayList;
import java.util.List;

import com.tns.fooddeliverysystem.entities.FoodItem;
import com.tns.fooddeliverysystem.entities.Restaurant;

public class FoodService {
 private List<Restaurant> restaurants = new ArrayList<>();

 public void addRestaurant(Restaurant restaurant) {
     restaurants.add(restaurant);
 }

 public List<Restaurant> getRestaurants() {
     return restaurants;
 }

 public List<FoodItem> getAllFoodItems() {
     List<FoodItem> allFoodItems = new ArrayList<>();
     for (Restaurant restaurant : restaurants) {
         allFoodItems.addAll(restaurant.getMenu());
     }
     return allFoodItems;
 }

 public void addFoodItemToRestaurant(int restaurantId, FoodItem foodItem) {
     for (Restaurant restaurant : restaurants) {
         if (restaurant.getId() == restaurantId) {
             restaurant.addFoodItem(foodItem);
             return;
         }
     }
 }

 public void removeFoodItemFromRestaurant(int restaurantId, int foodItemId) {
     for (Restaurant restaurant : restaurants) {
         if (restaurant.getId() == restaurantId) {
             restaurant.removeFoodItem(foodItemId);
             return;
         }
     }
 }
}
