package com.tns.banking.entities;

// Program to define Beneficiary Entity
public class Beneficiary {
    private int beneficiaryID;
    private int customerID;
    private String name;
    private String accountNumber;
    private String bankDetails;

    // Constructor
    public Beneficiary(int beneficiaryID, int customerID, String name, String accountNumber, String bankDetails) {
        this.beneficiaryID = beneficiaryID;
        this.customerID = customerID;
        this.name = name;
        this.accountNumber = accountNumber;
        this.bankDetails = bankDetails;
    }

    // Getters
    public int getBeneficiaryID() {
        return beneficiaryID;
    }

    public int getCustomerID() {
        return customerID;
    }

    public String getName() {
        return name;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getBankDetails() {
        return bankDetails;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBankDetails(String bankDetails) {
        this.bankDetails = bankDetails;
    }
}
