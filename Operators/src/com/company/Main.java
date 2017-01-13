package com.company;

public class Main {

    public static void main(String[] args) {
	    int result = 1 + 2;
        System.out.println("1 + 2 = " + result);

        int previousResult = result;

        result = result - 1;
        System.out.println(previousResult + " - 1 = " + result);

        previousResult = result;

        result = result * 10;
        System.out.println(previousResult + " * 10 = " + result);

        previousResult = result;
        result = result / 5;

        System.out.println(previousResult + " / 5 = " + result);

        previousResult = result;
        result = result % 3;
        System.out.println(previousResult + " % 3 = " + result);

        previousResult = result;
        result = result + 1;
        System.out.println("Result is now " + result);
        result++;
        System.out.println("Result is now " + result);
        result--;
        System.out.println("Result is now " + result);

        result += 2;
        System.out.println("Result is now " + result);
        result *= 10;
        System.out.println("Result is now " + result);
        result -= 10;
        System.out.println("Result is now " + result);
        result /=10;
        System.out.println("Result is now " + result);

        boolean isAlien = false;
        if (isAlien == true) {
            System.out.println("It is not an alien!");
        } else {
            System.out.println("lol");
        }

        int topScore = 100;
        if (topScore != 100) {
            System.out.println("You got the high score!");
        } else {
            System.out.println("You did not get the high score.");
        }

        if (topScore >= 100) {
            System.out.println("You got the top score >=");
        }

        topScore = 80;
        int secondTopScore = 60;
        if (topScore > secondTopScore && topScore < 100) {
            System.out.println("Greater than second top score and less than 100");
        }

        if (topScore > 90 || secondTopScore <= 90) {
            System.out.println("One of these tests is true");
        }

        boolean isCar = false;
        boolean wasCar = isCar ? true : false;
        if (!wasCar) {
            System.out.println("cool");
        }

        // 1.  Create a double variable with the value 20
        // 2. Create a second variable of type double with the value 80
        // 3. Add both numbers up and multiply by 25
        // 4. Use the remainder operator to figure out the remainder from the sum of #3 divided by 40
        // 5. Write an "if" statement that displays a message "Total was over the limit" if the remaining total (#4) is equal to 20 or less.

        double firstDouble = 20;
        double secondDouble = 80;
        double newTotal = (firstDouble + secondDouble) * 25;
        double remainder = newTotal % 40;
        if (remainder <= 20) {
            System.out.println(newTotal + " " + remainder + " Total was over the limit");
        }
    }
}
