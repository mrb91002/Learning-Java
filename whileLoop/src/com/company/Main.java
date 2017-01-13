package com.company;

public class Main {

    public static void main(String[] args) {
        int count = 6;
//        while(count != 5) {
//            System.out.println("Count value is " + count);
//            count++;
//        }
//
//        while(true) {
//            if (count == 5) {
//                break;
//            }
//
//            System.out.println("Count value is " + count);
//            count ++;
//        }

        do {
            System.out.println("Count value was " + count);
            count++;
        } while(count < 6);



        int number = 5;
        int finishNumber = 20;
        while(number <= finishNumber) {
            if (!isEvenNumber(number)) {
                number ++;
                continue;
            }

            System.out.println("Even number " + number);
            number ++;
        }

        System.out.println(isEvenNumber(52));

        // Modify the while code above
        // Make it also record the total number of even numbers it has found
        // and break once 5 are found
        // and at the end, display the total number of even number found

        int evenNumber = 0;
        int oddNumber = 0;

        while(evenNumber < 5 && oddNumber < 5) {
            if (!isEvenNumber(number)) {
                number ++;
                oddNumber++;
                continue;
            }

            evenNumber++;
            System.out.println("Even number " + number);
            number ++;
        }

        System.out.println(evenNumber + " " + oddNumber);

    }

    public static boolean isEvenNumber(int number) {
        // Create a method called isEvenNumber that takes a parameter of type int
        // Its purpose is to determine if the argument passed to the method is
        // and even number or not.
        // return true if an even number, otherwise return false;

        if (number % 2 == 0) {
            return true;
        }

        return false;
    }

}
