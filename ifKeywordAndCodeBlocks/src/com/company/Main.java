package com.company;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 5000;
        int levelCompleted = 5;
        int bonus = 100;
//
//        if (score < 5000) {
//            System.out.println("Your score was less than 5000");
//        } else {
//            System.out.println("Your score is more than 5000");
//        }

        if (gameOver == true) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("your final score was " + finalScore);
        }

    }
}
