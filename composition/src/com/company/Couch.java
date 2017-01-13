package com.company;

/**
 * Created by Matthew on 1/12/17.
 */
public class Couch {
    private String firmness;
    private String brand;

    public Couch(String firmness, String brand) {
        this.firmness = firmness;
        this.brand = brand;
    }

    private void sit() {
        System.out.println("You sit down...");
    }

    public void sitOnCouch() {
        sit();
        System.out.println("on the " + firmness + " couch.");
    }

    public void sitOnArmrest() {
        sit();
        System.out.println("... on the armrest.");
    }

    public String getBrand() {
        return brand;
    }

}
