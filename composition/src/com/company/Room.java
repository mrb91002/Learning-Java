package com.company;

/**
 * Created by Matthew on 1/12/17.
 */
public class Room {

    private boolean isWorking = false;
    private boolean isResting = false;
    private Desk myDesk;
    private Lamp myLamp;
    private Couch myCouch;
    private Tv myTv;


    public Room(Desk newDesk, Lamp newLamp, Couch newCouch, Tv newTv) {
        myDesk = newDesk;
        myLamp = newLamp;
        myCouch = newCouch;
        myTv = newTv;
    }

    public void work() {
        myLamp.turnOn();
        myDesk.work();
    }

    public void rest() {
        myCouch.sitOnCouch();
        myTv.changeChanel(16);
        myTv.turnTvOn();
        myTv.changeChanel(10);
    }


    public Desk getMyDesk() {
        return myDesk;
    }

    public Lamp getMyLamp() {
        return myLamp;
    }
}
