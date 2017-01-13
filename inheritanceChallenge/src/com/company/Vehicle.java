package com.company;

/**
 * Created by Matthew on 1/11/17.
 */
public class Vehicle {

    private String lights = "off";
    private String type;
    private int speed = 0;
    private int wheels;
    private boolean lightsOn = false;
    private boolean carOn = false;
    private String saying;

    public Vehicle(String type, int Wheels) {
        this.type = type;
        this.wheels = wheels;
    }

    public void turnCarOn() {
        if (this.carOn == false) {
            this.carOn = true;
            System.out.println("The car is now on");
        } else {
            System.out.println("The car was already on... you hear a grinding sound...");
        }
    }

    public void turnCarOff() {
        if (this.carOn == true) {
            this.carOn = false;
            System.out.println("the car is now off");
        } else {
            System.out.println("The car was already off");
        }

    }

    public void drive() {
        if (this.carOn == true) {
            if (this.speed == 0) {
                this.speed += 1;
                System.out.println("The car has started moving at speed level " + this.speed + "!");
            } else {
                System.out.println("You're already driving... perhaps speed up?");
            }
        } else {
            System.out.println("You need to turn the car on before we can start moving!");
        }
    }

    public void speedUp(int addSpeed) {
        this.speed += addSpeed;

        if (this.speed >= 5) {
            System.out.println("Are we allowed to go this fast?");
        }
    }

    public void slowDown() {
        if (this.speed == 0) {
            System.out.println("You can't really slow down... cause you're not moving");
        } else {
            this.speed -= 1;
            System.out.println(this.speed);
        }
    }

    public void turnOnLights() {
        if (this.lightsOn == true) {
            System.out.println("lights already on!");
        } else {
            this.lightsOn = true;
            System.out.println("Lights are now on!");
        }
    }

    public void turnOffLights() {
        if (this.lightsOn == false) {
            System.out.println("lights are already off!");
        } else {
            this.lightsOn = false;
            System.out.println("Lights are now off!");
        }
    }

    public void setSaying(String saying) {
        this.saying = saying;
        System.out.println("You will now say, '" + this.saying + "' " + "when someone says hi.");
    }

    public int getSpeed() {
        System.out.println(this.speed);
        return this.speed;
    }

}
