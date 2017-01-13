package com.company;

public class Main {

    public static void main(String[] args) {
        int myValue = 1000;
        int myMinValue= -2_147_483_648;
//        Any fixed number to the right is a literal
//        Anything that need evaluation is an expression
        int myMaxValue = 2_147_483_647;

        byte myByteValue = 10;
        byte myByteMax = 127;
        byte myByteMin = -128;
        byte myNewByteValue = (byte) (myByteValue/2);
        System.out.println("myNewByteValue = " + myNewByteValue);

        short myShortValue = -32768;
        short myShortMax = -32767;

        long myLongValue = 100L;


//    int has a width of 32
//    byte has a width of 8
//    short has a width of 16
//        long has a width of 64

        byte myByte = 100;
        short myShort = 1000;
        int myInt = 1;
        long myLong = 100000000L;

        long myCalcLong = 50000 + 10 * (myByte + myShort + myInt);
        short shortTotal = (short) (1000 + 10 * (myByte + myShort + myInt));

        System.out.println("The answer is: " + myCalcLong);



    }
}
