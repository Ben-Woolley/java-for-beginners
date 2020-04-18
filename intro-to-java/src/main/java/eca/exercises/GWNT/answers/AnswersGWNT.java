package eca.exercises.GWNT.answers;

import eca.util.UserInputUtil;
import java.util.Random;

public class AnswersGWNT {

    private static String YOU_WIN = "You Win!";
    private static String YOU_LOSE = "You Lose!";

    public static void main(String[] args) {
        // Get a random number
        var randomNumber = new Random().nextInt(9) + 1; // We add 1 because nextInt returns a random number from 0 to n inclusive

        // Let the user enter a number
        System.out.print("Guess a number from 1 to 10: ");
        var guess = UserInputUtil.readInteger();

        // Check if the numbers match
        var correct = guess.equals(randomNumber);

        // If the user's number matches the random number, they win!
        if (correct) {
            System.out.println(YOU_WIN);
        } else {
            System.out.println(YOU_LOSE);
        }
    }
}
