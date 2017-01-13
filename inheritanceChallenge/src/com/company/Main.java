package com.company;

public class Main extends Object{

    public static void main(String[] args) {

        // Challenge.
        // Start with a base class of a Vehicle, then create a Car class that inherits from this base class.
        // Finally, create another class, a specific type of Car that inherits from the car class.
        // You should be able to handle steering, changing gears, and moving (speed in other words).
        // You will want to decide where to put the appropriate state and behaviours (fields and methods).
        // As mentioned above, changing gears, increasing/decreasing speed should be included.
        // For your specific type of vehicle you will want to add something specific for that type of car.


        Jeep wrangler = new Jeep(2,"Inline 6", false);
        wrangler.drive();
        wrangler.turnCarOn();
        wrangler.turnCarOn();
        wrangler.drive();
        wrangler.drive();
        wrangler.speedUp(3);
        wrangler.getSpeed();
        wrangler.speedUp(3);
        wrangler.slowDown();
        wrangler.slowDown();
        wrangler.slowDown();
        wrangler.slowDown();
        wrangler.slowDown();
        wrangler.slowDown();
        wrangler.slowDown();
        wrangler.slowDown();
        wrangler.turnCarOff();
        wrangler.turnCarOff();


    }
}
