// BankingSystemApp.java
package com.tns.banking.application;

import java.util.List;
import java.util.Scanner;
import com.tns.banking.entities.Account;
import com.tns.banking.entities.Beneficiary;
import com.tns.banking.entities.Customer;
import com.tns.banking.entities.Transaction;
import com.tns.banking.services.BankingService;
import com.tns.banking.services.BankingServiceImpl;

public class BankingSystemApp {

    public static void main(String[] args) {
        BankingService bankingService = new BankingServiceImpl();
        int accountID, customerID, beneficiaryID, transactionID;
        String type, name, accountNumber, bankDetails, address, contact;
        double balance, amount;
        int ch;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Banking System");
            System.out.println("1. Add Customers");
            System.out.println("2. Add Accounts");
            System.out.println("3. Add Beneficiary");
            System.out.println("4. Add Transaction");
            System.out.println("5. Find Customer by Id");
            System.out.println("6. List all Accounts of specific Customer");
            System.out.println("7. List all transactions of specific Account");
            System.out.println("8. List all beneficiaries of specific customer");
            System.out.println("9. Exit");
            System.out.print("Enter your choice: ");
            ch = sc.nextInt();

            switch (ch) {
                case 1:
                    System.out.println("Enter Customer Details");
                    System.out.print("Customer Id: ");
                    customerID = sc.nextInt();
                    System.out.print("Name: ");
                    sc.nextLine();  // Clear the buffer
                    name = sc.nextLine();
                    System.out.print("Address: ");
                    address = sc.nextLine();
                    System.out.print("Contact No.: ");
                    contact = sc.nextLine();
                    Customer c = new Customer(customerID, name, address, contact);
                    bankingService.addCustomer(c);
                    break;

                case 2:
                    System.out.println("Enter Account Details");
                    System.out.print("Account Id: ");
                    accountID = sc.nextInt();
                    System.out.print("Customer Id: ");
                    customerID = sc.nextInt();
                    sc.nextLine();  // Clear the buffer
                    System.out.print("Account Type (Saving/Current): ");
                    type = sc.nextLine();
                    System.out.print("Balance: ");
                    balance = sc.nextDouble();
                    Account acc = new Account(accountID, customerID, type, balance);
                    bankingService.addAccount(acc);
                    break;

                case 3:
                    System.out.println("Enter Beneficiary Details");
                    System.out.print("Customer Id: ");
                    customerID = sc.nextInt();
                    System.out.print("Beneficiary Id: ");
                    beneficiaryID = sc.nextInt();
                    System.out.print("Beneficiary Name: ");
                    sc.nextLine();  // Clear the buffer
                    name = sc.nextLine();
                    System.out.print("Beneficiary Account No.: ");
                    accountNumber = sc.nextLine();
                    System.out.print("Beneficiary Bank details: ");
                    bankDetails = sc.nextLine();
                    Beneficiary b = new Beneficiary(customerID, beneficiaryID, name, accountNumber, bankDetails);
                    bankingService.addBeneficiary(b);
                    break;

                case 4:
                    System.out.println("Enter Transaction Details");
                    System.out.print("Account Id: ");
                    accountID = sc.nextInt();
                    sc.nextLine();  // Clear the buffer
                    System.out.print("Type (Deposit/Withdraw): ");
                    type = sc.nextLine();
                    System.out.print("Amount: ");
                    amount = sc.nextDouble();
                    Transaction t = new Transaction(accountID, type, amount);
                    bankingService.addTransaction(t);
                    break;

                case 5:
                    System.out.println("List of Customers:");
                    for (Customer customer : bankingService.getAllCustomers()) {
                        System.out.println("Customer ID: " + customer.getCustomerID() + ", Name: " + customer.getName());
                    }
                    System.out.print("Enter Customer Id: ");
                    customerID = sc.nextInt();
                    Customer foundCustomer = bankingService.findCustomerById(customerID);
                    if (foundCustomer != null) {
                        System.out.println("Customer: " + foundCustomer.getName());
                    } else {
                        System.out.println("Customer not found.");
                    }
                    break;

                case 6:
                    System.out.print("Enter Customer Id: ");
                    customerID = sc.nextInt();
                    List<Account> customerAccounts = bankingService.getAccountsByCustomerId(customerID);
                    System.out.println("Accounts for Customer ID: " + customerID);
                    for (Account account : customerAccounts) {
                        System.out.println("Account ID: " + account.getAccountID() + ", Balance: " + account.getBalance());
                    }
                    break;

                case 7:
                    System.out.print("Enter Account Id: ");
                    accountID = sc.nextInt();
                    List<Transaction> accountTransactions = bankingService.getTransactionsByAccountId(accountID);
                    System.out.println("Transactions for Account ID: " + accountID);
                    for (Transaction transaction : accountTransactions) {
                        System.out.println("Transaction ID: " + transaction.getTransactionID() + ", Type: " + transaction.getType() +
                                           ", Amount: " + transaction.getAmount() + ", Timestamp: " + transaction.getTimestamp());
                    }
                    break;

                case 8:
                    System.out.print("Enter Customer Id: ");
                    customerID = sc.nextInt();
                    List<Beneficiary> customerBeneficiaries = bankingService.getBeneficiariesByCustomerId(customerID);
                    System.out.println("Beneficiaries for Customer ID: " + customerID);
                    for (Beneficiary beneficiary : customerBeneficiaries) {
                        System.out.println("Beneficiary ID: " + beneficiary.getBeneficiaryID() + ", Name: " + beneficiary.getName() +
                                           ", Account No.: " + beneficiary.getAccountNumber() + ", Bank: " + beneficiary.getBankDetails());
                    }
                    break;

                case 9:
                    System.out.println("Thank you!");
                    break;

                default:
                    System.out.println("Invalid Choice");
            }
        } while (ch != 9);
    }
}
