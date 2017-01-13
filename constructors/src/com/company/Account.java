package com.company;

/**
 * Created by Matthew on 1/11/17.
 */
public class Account {

    // Create fields for the account number, balance, customer name, email and phone number.

    private int accountNumber;
    private double balance;
    private String name;
    private String email;
    private int phoneNumber;

    public Account() {
        this(12345, 2.50, "Default Name", "Default Email", 123456);
    }

    public Account(int accountNumber, double balance, String name, String email, int phoneNumber) {
        System.out.println("Account constructor with parameters called");
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public Account(String name, String email, int phoneNumber) {
        this(99999, 100.55, name, email, phoneNumber);
    }

    public void setAccountNumber(int accountNumber) {
        if (accountNumber >= 0 ) {
            this.accountNumber = accountNumber;
        } else {
            this.accountNumber = 0;
        }
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

//    Begin the Getters
    public int getAccountNumber() {
        return this.accountNumber;
    }

    public double getBalance() {
        return this.balance;
    }

    public String getName() {
        return this.name;
    }

    public String getEmail() {
        return this.email;
    }

    public int getPhoneNumber() {
        return this.phoneNumber;
    }

    public void addFunds(double money) {
        this.balance += money;
    }

    public void removeFunds(double money) {
        if (this.balance - money >= 0) {
            this.balance -= money;
        } else {
            System.out.println("Insufficient Funds");
        }
    }



}
