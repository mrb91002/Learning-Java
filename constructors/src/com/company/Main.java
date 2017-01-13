package com.company;

public class Main {

    public static void main(String[] args) {
        // Create a new class for a bank account
        // Create fields for the account number, balance, customer name, email and phone number.
        //
        // Create getters and setters for each field
        // Create two additional methods
        // 1.  To allow the customer to deposit funds (this shoud increment the balance field).
        // 2.  To allow the customer to withdraw funds.  This should deduct from the balance field,
        // but not allow the withdrawl to complete if there are insufficient funds.
        // You will want to create varius code in the Main class (the one created by IntelliJ) to
        // confirm your code is working.
        // Add some System.out.println's in the two methods above as well.

//        Account myAccount = new Account( 111, 100_000.11, "Iceman", "testemail@gmail.com", 2069153079);
//        myAccount.setAccountNumber(111);
//        myAccount.setName("Iceman");
//        myAccount.setBalance(100_000);
//        myAccount.setEmail("testemail@gmail.com");
//        myAccount.setPhoneNumber(2069153077);

//        System.out.println(myAccount.getAccountNumber());
//        System.out.println(myAccount.getBalance());
//        System.out.println(myAccount.getEmail());
//        System.out.println(myAccount.getName());
//        System.out.println(myAccount.getPhoneNumber());
//
//        myAccount.addFunds(100_000);
//        System.out.println(myAccount.getBalance());
//        myAccount.removeFunds(199999);
//        System.out.println(myAccount.getBalance());
//        myAccount.removeFunds(199999);
//        System.out.println(myAccount.getBalance());
//
//        Account newAccount = new Account();
//        System.out.println(newAccount.getBalance());
//
//        Account thirdAccount = new Account("Tim", "Tim@email.com", 12345);
//        System.out.println(thirdAccount.getAccountNumber());

        // Create a new class VipCustomer
        // it should have 3 fields name, credit limit, and email adress.
        // create 3 constructors
        // 1st constructor empty should call the constructor with 3 parameters with default values
        // 2nd constructor should pass on the 2 values it receives and add a default value for the 3rd
        // 3rd constructor should save all fields.
        // create getters only for this using code generation of intelliJ as setters wont be neeed
        // test and confirm it works.

        VipCustomer matt = new VipCustomer();
        System.out.println(matt.getName());
        System.out.println(matt.getEmail());
        System.out.println(matt.getCreditLimit());

        VipCustomer jon = new VipCustomer("Jon", "Jon@gmail.com");
        System.out.println(jon.getName());
        System.out.println(jon.getEmail());
        System.out.println(jon.getCreditLimit());

        VipCustomer chris = new VipCustomer("Chris", "Chris@gmail.com", 1_000_000);
        System.out.println(chris.getName());
        System.out.println(chris.getEmail());
        System.out.println(chris.getCreditLimit());

    }
}
