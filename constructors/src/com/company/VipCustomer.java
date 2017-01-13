package com.company;

/**
 * Created by Matthew on 1/11/17.
 */
public class VipCustomer {
    private String name;
    private double creditLimit;
    private String email;

    public VipCustomer(String name, String email, double creditLimitLimit) {
        this.name = name;
        this.creditLimit = creditLimitLimit;
        this.email = email;
    }

    public VipCustomer(String name, String email) {
        this(name, email, 1000);
    }

    public VipCustomer() {
        this("Unknown", "Unknown@gmail.com", 1000);
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }

    // Create a new class VipCustomer
    // it should have 3 fields name, credit limit, and email address.
    // create 3 constructors
    // 1st constructor empty should call the constructor with 3 parameters with default values
    // 2nd constructor should pass on the 2 values it receives and add a default value for the 3rd
    // 3rd constructor should save all fields.
    // create getters only for this using code generation of intelliJ as setters wont be need
    // test and confirm it works.
}
