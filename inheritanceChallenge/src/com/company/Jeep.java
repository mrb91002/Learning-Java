package com.company;

/**
 * Created by Matthew on 1/11/17.
 */
public class Jeep extends Vehicle {

    private int gear = 0;
    private int doors;
    private String engine;
    private boolean transmission;

    public Jeep(int doors, String engine, boolean transmissionAutomatic) {
        super("jeep", 4);

        this.doors = doors;
        this.engine = engine;
        this.transmission = transmission;
    }

    @Override
    public void drive() {
        System.out.println("This is overwriting the default method, but we are then calling the same method with super.drive()");

        if (this.gear == 0) {
            shiftUp();
        }

        super.drive();
    }

    @Override
    public void speedUp(int addSpeed) {

        if (getSpeed() > 2 && this.gear == 1) {
            System.out.println("You need to shift");
        } else {
            super.speedUp(addSpeed);
        }
    }

    public void shiftUp() {
        if (this.gear < 5) {
            this.gear += 1;
        } else {
            System.out.println("Already on max gear");
        }


    }
}
