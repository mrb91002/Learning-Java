package com.company;

public class Main {

    public static void main(String[] args) {
        // width of int = 32 (4 bytes).
	    int myIntValue = 5;
	    // width of float = 32 (4 bytes).
	    float myFloatValue = 5f / 2;
	    // width of double= 64 (8 bytes).
        // should almost always use doubles.
	    double myDoubleValue = 5d;

        System.out.println("myIntValue = " + myIntValue);
        System.out.println("myFloatValue = " + myFloatValue);
        System.out.println("myDoubleValue = " + myDoubleValue);

        // Convert a given number of pounds to kilograms
        // 1.  Create a variable to store the number of pounds
        // 2.  Calculate the number of Kilograms for the number above and store in a variable.
        // 3. Print out the result.
        //
        // NOTES: 1 pound is equal to 0.45359237 kilograms.

        int pounds = 200;
        double kilograms = 0.45359237d * pounds;

        System.out.println(pounds + " pounds is the same as " + kilograms + " kilograms!");
    }
}
