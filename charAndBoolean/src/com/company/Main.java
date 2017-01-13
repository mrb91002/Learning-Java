package com.company;

public class Main {

    public static void main(String[] args) {
        // width of 16 (2 bytes)
	    char myChar = '\u269C';
        System.out.println(myChar);

        boolean myBoolean = true;
        boolean isMale = true;

        // 1. Find the code for the code for the registered symbol on the same line as the copyright symbol.
        // 2. Create a variable of type char and assign it the unicode value for that symbol.
        // 3. Display in on screen.

        char registered = '\u00AE';
        System.out.println(registered);
    }
}
