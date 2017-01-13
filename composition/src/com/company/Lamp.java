package com.company;

/**
 * Created by Matthew on 1/12/17.
 */
public class Lamp {

    private int lumens;
    private boolean isOn;

    public Lamp(int lumens, boolean isOn) {
        this.lumens = lumens;
        this.isOn = isOn;
    }

    public void turnOn() {
        if (isOn == false) {
            isOn = true;
            System.out.println("You turn the lamp on");
        }   else {
            System.out.println("The Lamp is already on.");
        }
    }

    public void turnOff() {
        if (isOn == true) {
            isOn = false;
        }   else {
            System.out.println("The Lamp is already off.");
        }
    }

    public String isOn() {
        if (isOn) {
            return "On";
        }

        return "Off";
    }
}
