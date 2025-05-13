package com.tns.fooddeliverysystem.application;

import java.util.Map;
import java.util.Scanner;

import com.tns.fooddeliverysystem.entities.Customer;
import com.tns.fooddeliverysystem.entities.DeliveryPerson;
import com.tns.fooddeliverysystem.entities.FoodItem;
import com.tns.fooddeliverysystem.entities.Order;
import com.tns.fooddeliverysystem.entities.Restaurant;
import com.tns.fooddeliverysystem.services.CustomerService;
import com.tns.fooddeliverysystem.services.FoodService;
import com.tns.fooddeliverysystem.services.OrderService;

public class FoodDeliverySystem {
    private static FoodService foodService = new FoodService(); 
    private static OrderService orderService = new OrderService(); 
    private static CustomerService customerService = new CustomerService(); 

    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in); 
        int customerChoice, adminChoice; 
        while (true) { 
            System.out.println("1. Admin Menu"); 
            System.out.println("2. Customer Menu"); 
            System.out.println("3. Exit"); 
            System.out.print("Choose an option: "); 
            int choice = scanner.nextInt(); 
            switch (choice) { 
                case 1: // Admin Module 
                    do { 
                        System.out.println("\nAdmin Menu:"); 
                        System.out.println("1. Add Restaurant"); 
                        System.out.println("2. Add Food Item to Restaurant"); 
                        System.out.println("3. Remove Food Item from Restaurant"); 
                        System.out.println("4. View Restaurants and Menus"); 
                        System.out.println("5. View Orders"); 
                        System.out.println("6. Add Delivery Person"); 
                        System.out.println("7. Assign Delivery Person to Order"); 
                        System.out.println("8. Exit"); 
                        System.out.print("Choose an option: "); 
                        adminChoice = scanner.nextInt(); 
                        switch (adminChoice) { 
                        case 1: 
                            addRestaurant(scanner); 
         
                            break; // Added break here
                        case 2: 
                        	addFoodItemToRestaurant(scanner); 
                            
                            break; // Added break here
                        case 3: 
                        	removeFoodItemFromRestaurant(scanner); 
                            
                            break; // Added break here
                        case 4: 
                        	viewRestaurantsAndMenus(); 
                            
                            break; // Added break here
                        case 5: 
                        	viewOrders(); 
                            
                            break; // Added break here
                        case 6: 
                        	addDeliveryPerson(scanner); 
                            
                            break; // Added break here
                        case 7: 
                        	assignDeliveryPersonToOrder(scanner); 
                            System.out.println("Exiting Admin Module");
                            break; // Added break here
                        case 8: 
                        	
                            System.out.println("Exiting Admin Module");
                            break; 
                        default: 
                            System.out.println("Invalid choice! Please try again.");
                    }

                    } while (adminChoice != 8); 
                    break;
                case 2: 
                    do { 
                        System.out.println("\nCustomer Menu:"); 
                        System.out.println("1. Add Customer"); 
                        System.out.println("2. View Food Items"); 
                        System.out.println("3. Add Food to Cart"); 
                        System.out.println("4. View Cart"); 
                        System.out.println("5. Place Order"); 
                        System.out.println("6. View Orders"); 
                        System.out.println("7. Exit"); 
                        System.out.print("Choose an option: "); 
                        customerChoice = scanner.nextInt(); 

                        switch (customerChoice) { 
                            case 1: 
                                createCustomer(scanner); 
                                break; 
                            case 2: 
                                viewRestaurantsAndMenus(); 
                                break; 
                            case 3: 
                                addToCart(scanner); 
                                break; 
                            case 4: 
                                viewCart(scanner); 
                                break; 
                            case 5: 
                                placeOrder(scanner); 
                                break; 
                            case 6: 
                                viewOrders(); 
                                break; 
                            case 7: 
                                System.out.println("Exiting Customer Module"); 
                                break; 
                            default: 
                                System.out.println("Invalid choice! Please try again."); 
                        } 
                    } while (customerChoice != 7); 
                    break; 
                case 3: System.out.println("Thanks for using Food Delivery System!!"); 
                return; 
                }}}
    private static void addRestaurant(Scanner scanner) {
        System.out.print("Enter Restaurant ID: ");
        int id = scanner.nextInt();
        System.out.print("Enter Restaurant Name: ");
        String name = scanner.next();
        
        // Creating a new Restaurant object
        Restaurant restaurant = new Restaurant(id, name);
        foodService.addRestaurant(restaurant); // Assuming this method adds the restaurant to the system
        
        System.out.println("Restaurant added successfully!");
    }

    private static void addFoodItemToRestaurant(Scanner scanner) {
        System.out.print("Enter Restaurant ID: ");
        int restaurantId = scanner.nextInt();
        System.out.print("Enter Food Item ID: ");
        int foodItemId = scanner.nextInt();
        System.out.print("Enter Food Item Name: ");
        String name = scanner.next();
        System.out.print("Enter Food Item Price: ");
        double price = scanner.nextDouble();
        
        // Creating a new FoodItem object
        FoodItem foodItem = new FoodItem(foodItemId, name, price);
        
        // Adding the food item to the specified restaurant
        foodService.addFoodItemToRestaurant(restaurantId, foodItem);
        
        System.out.println("Food item added successfully!");
    }
    private static void removeFoodItemFromRestaurant(Scanner scanner) {
        System.out.print("Enter Restaurant ID: ");
        int restaurantId = scanner.nextInt();
        System.out.print("Enter Food Item ID: ");
        int foodItemId = scanner.nextInt();
        
        // Assuming this method removes the food item from the restaurant
        foodService.removeFoodItemFromRestaurant(restaurantId, foodItemId);
        System.out.println("Food item removed successfully!");
    }

    private static void viewOrders() {
        System.out.println("Orders:");
        
        // Assuming orderService.getOrders() returns a list of orders
        for (Order order : orderService.getOrders()) {
            System.out.println(order); // You may want to format the order details here
        }
    }

    private static void addDeliveryPerson(Scanner scanner) {
        System.out.print("Enter Delivery Person ID: ");
        int id = scanner.nextInt(); // Fixed missing 'id' assignment
        
        System.out.print("Enter Delivery Person Name: ");
        String name = scanner.next(); // Read the delivery person's name
        
        System.out.print("Enter Contact No.: ");
        long contactNo = scanner.nextLong(); // Read the delivery person's contact number
        
        // Creating a new DeliveryPerson object
        DeliveryPerson deliveryPerson = new DeliveryPerson(id, name, contactNo);
        
        // Assuming this method adds the delivery person to the order service
        orderService.addDeliveryPerson(deliveryPerson);
        
        System.out.println("Delivery person added successfully!");
    }
    private static void assignDeliveryPersonToOrder(Scanner scanner) {
        System.out.print("Enter Order ID: ");
        int orderId = scanner.nextInt();  // Fixed missing semicolon
        System.out.print("Enter Delivery Person ID: ");
        int deliveryPersonId = scanner.nextInt();  // Fixed missing semicolon
        
        // Assuming this method assigns the delivery person to the order
        orderService.assignDeliveryPersonToOrder(orderId, deliveryPersonId);
        System.out.println("Delivery person assigned to order successfully!");
    }

    private static void viewRestaurantsAndMenus() {
        System.out.println("Restaurants and Menus:");
        
        // Assuming foodService.getRestaurants() returns a list of restaurants
        for (Restaurant restaurant : foodService.getRestaurants()) {
            // Fixed string concatenation and added missing semicolons
            System.out.println("Restaurant ID: " + restaurant.getId() + ", Name: " + restaurant.getName());
            
            // Assuming restaurant.getMenu() returns a list of FoodItem objects
            for (FoodItem foodItem : restaurant.getMenu()) {
                // Fixed string concatenation and added missing semicolons
                System.out.println("Food Item ID: " + foodItem.getId() + ", Name: " + foodItem.getName() + ", Price: $" + foodItem.getPrice());
            }
        }
    }

    private static void createCustomer(Scanner scanner) {
        System.out.print("Enter User ID: ");
        int userId = scanner.nextInt();  // Fixed missing semicolon
        System.out.print("Enter Username: ");
        String username = scanner.next();  // Fixed missing semicolon
        System.out.print("Enter Contact No.: ");
        long contactNo = scanner.nextLong();  // Fixed missing semicolon
        
        // Assuming the Customer class constructor takes these arguments
        Customer customer = new Customer(userId, username, contactNo);
        
        // Assuming customerService.addCustomer adds the customer to a list
        customerService.addCustomer(customer);
        System.out.println("Customer created successfully!");
    }
    private static void addToCart(Scanner scanner) {
        System.out.print("Enter Customer ID: ");
        int customerId = scanner.nextInt();

        // Fetch the customer using the customerService
        Customer customer = customerService.getCustomer(customerId);

        // Check if customer exists
        if (customer == null) {
            System.out.println("Customer not found!");
            return;  // Exit if customer not found
        }

        System.out.print("Enter Restaurant ID: ");
        int restaurantId = scanner.nextInt();

        System.out.print("Enter Food Item ID: ");
        int foodItemId = scanner.nextInt();

        FoodItem foodItem = null;

        // Loop through restaurants to find the restaurant with the given ID
        for (Restaurant restaurant : foodService.getRestaurants()) {
            if (restaurant.getId() == restaurantId) {  // Corrected the comparison operator
                // Loop through the menu to find the food item with the given ID
                for (FoodItem item : restaurant.getMenu()) {
                    if (item.getId() == foodItemId) {  // Corrected the comparison operator
                        foodItem = item;
                        break;
                    }
                }
                break;  // Exit once the restaurant is found
            }
        }

        // Check if the food item was found
        if (foodItem == null) {
            System.out.println("Food item not found!");
            return;  // Exit if food item is not found
        }

        System.out.print("Enter Quantity: ");
        int quantity = scanner.nextInt();

        // Add the food item to the cart
        customer.getCart().addItem(foodItem, quantity);
        System.out.println("Food item added to cart!");
    }
    private static void viewCart(Scanner scanner) {
        System.out.print("Enter Customer ID: ");
        int customerId = scanner.nextInt();

        // Fetch the customer using the customerService
        Customer customer = customerService.getCustomer(customerId);

        // Check if customer exists
        if (customer == null) {
            System.out.println("Customer not found!");
            return;  // Exit if customer not found
        }

        System.out.println("Cart:");
        Map<FoodItem, Integer> items = customer.getCart().getItems();  // Corrected the declaration

        // Check if cart is empty
        if (items.isEmpty()) {
            System.out.println("Your cart is empty.");
        } else {
            double totalCost = 0.0;

            // Iterate through cart items and display them
            for (Map.Entry<FoodItem, Integer> entry : items.entrySet()) {  // Corrected the loop
                FoodItem foodItem = entry.getKey();
                int quantity = entry.getValue();

                // Calculate the cost for the item
                double cost = foodItem.getPrice() * quantity;  // Fixed the cost calculation
                totalCost += cost;

                // Display item details
                System.out.println("Food Item: " + foodItem.getName() + ", Quantity: " + quantity + ", Cost: Rs." + cost);
            }

            // Display total cost
            System.out.println("Total Cost: Rs." + totalCost);
        }
    }private static void placeOrder(Scanner scanner) {
        System.out.print("Enter Customer ID: ");
        int customerId = scanner.nextInt();

        // Fetch the customer using customerService
        Customer customer = customerService.getCustomer(customerId);

        if (customer == null) {  // Check if the customer exists
            System.out.println("Customer not found!");
            return;  // Exit if customer not found
        }

        // Get the items in the customer's cart
        Map<FoodItem, Integer> cartItems = customer.getCart().getItems();

        // Check if the cart is empty
        if (cartItems.isEmpty()) {
            System.out.println("Your cart is empty. Add items to your cart before placing an order.");
            return;  // Exit if the cart is empty
        }

        // Create an order and assign a new order ID
        Order order = new Order(orderService.getOrders().size() + 1, customer);

        // Add items to the order
        for (Map.Entry<FoodItem, Integer> entry : cartItems.entrySet()) {
            order.addItem(entry.getKey(), entry.getValue());
        }

        // Place the order
        orderService.placeOrder(order);

        // Clear the cart after placing the order
        customer.getCart().getItems().clear();

        // Print the order ID
        System.out.println("Order placed successfully! Your order ID is: " + order.getOrderId());
    }
}
