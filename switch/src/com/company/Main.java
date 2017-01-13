package com.company;

public class Main {

    public static void main(String[] args) {
        int value = 1;

        if (value == 1) {
            System.out.println("value was 1");
        } else if (value == 2) {
            System.out.println("value was 2");
        } else {
            System.out.println("Was not one or two");
        }

        int switchValue = 4;

//        switch can take byte short char and int

        switch (switchValue) {
            case 1:
                System.out.println("value was 1");
                break;

            case 2:
                System.out.println("value was 2");
                break;

            case 3:case 4:case 5:
                System.out.println("was a 3, or a 4, or a 5");
                break;

            default:
                System.out.println("Was not 1 or 2");
                break;
        }

        // Create a new switch statement using char instead of int
        // create a new Char variable
        // create a switch statement testing for
        // A, B, C, D, or E
        // display a message if any of these are found and then break
        // add a default which display a message saying not found

       char myChar = 'C';

        switch(myChar) {
            case 'A':case 'B':case 'C':case 'D':case 'E':
                System.out.println("myChar is: " + myChar);
                break;

            default:
                System.out.println("This is the default");
                break;
        }
    }
}
