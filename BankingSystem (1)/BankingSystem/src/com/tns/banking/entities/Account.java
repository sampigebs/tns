package com.tns.banking.entities;

// Program to define Account Entity
public class Account {
    private int accountID;
    private int customerID;
    private String type;
    private double balance;

    // Constructor
    public Account(int accountID, int customerID, String type, double balance) {
        this.accountID = accountID;
        this.customerID = customerID;
        this.type = type;
        this.balance = balance;
    }

    // Getters
    public int getAccountID() {
        return accountID;
    }

    public int getCustomerID() {
        return customerID;
    }

    public String getType() {
        return type;
    }

    public double getBalance() {
        return balance;
    }

    // Setters
    public void setType(String type) {
        this.type = type;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
