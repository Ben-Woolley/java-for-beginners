package eca.lessons.lesson2.exercises.GWNT;

import eca.util.UserInputUtil;
import java.util.Random;

public class GuessWhatNumberImThinking {

    static String YOU_WIN = "You Win!";
    static String YOU_LOSE = "You LOSE!";

    public static String guessWhatNumber() {
        // Get a random number

        // Let the user enter a number

        // If the user's number matches the random number, they win!

        // Print the result, then return it
        System.out.println(YOU_LOSE);
        return YOU_LOSE;
    }


    public static void main(String[] args) {
        guessWhatNumber();
    }
}
