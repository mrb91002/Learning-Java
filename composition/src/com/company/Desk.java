package com.company;

/**
 * Created by Matthew on 1/12/17.
 */
public class Desk {
    private int width;
    private int depth;
    private String material;


    public Desk(int width, int depth, String material) {
        this.width = width;
        this.depth = depth;
        this.material = material;
    }

    private void openDesk() {
        System.out.println("You open the desk and grab a pencil.");
    }

    public void work() {
        openDesk();
        System.out.println("You begin working on your memoir.");
    }
}
