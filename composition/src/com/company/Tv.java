package com.company;

/**
 * Created by Matthew on 1/12/17.
 */
public class Tv {
    private int chanel;
    private String brand;
    private boolean isOn;

    public Tv(int channel, String brand, boolean isOn) {
        this.chanel = channel;
        this.brand = brand;
        this.isOn = isOn;
    }

    public void turnTvOn() {
        this.isOn = true;
        System.out.println("You turn the Tv On");
    }

    public void turnTvOff() {
        this.isOn = false;
        System.out.println("You turn the Tv On");
    }

    public void changeChanel(int newChannel) {
        if (isOn) {
            int previousChanel = this.chanel;
            this.chanel = newChannel;
            System.out.println("You change the chanel from  " + previousChanel + " to " + this.chanel);
        } else {
            System.out.println("You click the chanel button like an idiot...");
        }
    }

}
