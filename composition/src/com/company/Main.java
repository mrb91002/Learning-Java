package com.company;

public class Main {

    public static void main(String[] args) {
//        Dimensions dimensions = new Dimensions(20, 20, 5);
//        Case theCase = new Case("220B", "Dell", "240", dimensions);
//
//
//        Monitor theMonitor = new Monitor("27inch Beast", "Acer", 27, new Resolution(2540, 1440));
//
//        Motherboard theMotherboard = new Motherboard("BJ-200", "Asus", 4, 6, "v2.44");
//
//        PC thePC = new PC(theCase, theMonitor, theMotherboard);
//        thePC.powerUp();

        // Create a single room of a house using composition.
        // Think about the things that should be included in the room.
        // Maybe physical parts of the house but furniture as well
        // Add at least one method to access an object via a getter and
        // then that objects public method as you saw in the previous video
        // but to access the object used in composition within the main class
        // like you saw in this video.

        Lamp myLamp = new Lamp(200, false);
        Couch myCouch = new Couch("Firm","Lazy boy");

        Room myRoom = new Room(new Desk(12,20,"Mahogany"), myLamp, myCouch, new Tv(13,"LG", false));

        myRoom.work();
        System.out.println("The lamp in my room is " + myRoom.getMyLamp().isOn());
        myRoom.getMyLamp().turnOff();
        System.out.println("The lamp in my room is " + myRoom.getMyLamp().isOn());

        myRoom.rest();

    }
}
