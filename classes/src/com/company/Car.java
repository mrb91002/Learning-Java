package com.company;

/**
 * Created by Matthew on 1/11/17.
 */
public class Car {
//    class, member, variables or fields
// encapsulation is used to hide fields from anything outside... internal
// workings of the object are hidden

    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String color;

    public void setModel(String model) {
        String validModel = model.toLowerCase();
        if (validModel.equals("carrera") || validModel.equals("commodore")) {
            this.model = model;
        } else {
            this.model = "Unknown";
        }
    }

    public String getModel() {
        return this.model;
    }
}
