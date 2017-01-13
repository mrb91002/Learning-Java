package com.company;

public class Main {

    public static void main(String[] args) {
        int highScore = calculateScore(true, 800, 5, 100);
        int otherHighScore = calculateScore(true, 10000, 8, 200);
        System.out.println("1st: highScore " + highScore + " 2nd: highScore " +otherHighScore);

        // Create a method called displayHighScorePosition
        // it should take a players name as a parameter, and a 2nd parameter as a position in the high score table
        // You should display the players name along with a message like " managed to get into position " and the
        // position they got and a a further message " on the high score table".
        //
        // Create a 2nd method called calculateHighScorePosition
        // it should be sent on argument only, the player score
        // it should return an int
        // the return data should be
        // 1 if the score is >1000
        // 2 if the score is >500 and < 1000
        // 3 if the score is > 100 and < 500
        // 4 in all other cases
        // call both methods and display the results of the following
        // a score of 1500, 900, 400, and 50

        String name = "matt";

        displayHighScorePosition(name, calculateHighScorePosition(1500));
        displayHighScorePosition(name, calculateHighScorePosition(900));
        displayHighScorePosition(name, calculateHighScorePosition(400));
        displayHighScorePosition(name, calculateHighScorePosition(50));



    }

    public static void displayHighScorePosition(String name, int position) {
        System.out.println(name + " managed to get into position " + position + " on the high score table");
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
    // void means don't return anything back --- this is also called a procedure

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;
        }

        return -1;
    }

    public static int calculateHighScorePosition(int score) {
        if (score >= 1000) {
            return 1;
        } else if (score >= 500 && score < 1000) {
            return 2;
        } else if (score >= 100 && score < 500) {
            return 3;
        } else {
            return 4;
        }
    }


}
