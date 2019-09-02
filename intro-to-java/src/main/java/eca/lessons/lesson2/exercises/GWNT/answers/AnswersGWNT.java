package eca.lessons.lesson2.exercises.GWNT.answers;

import eca.util.UserInputUtil;
import java.util.Random;

public class AnswersGWNT {

    static String YOU_WIN = "You Win!";
    static String YOU_LOSE = "You Lose!";

    public static void guessWhatNumber() {
        // Get a random number
        Integer randomNumber = new Random().nextInt(9) + 1; // We add 1 because nextInt returns a random number from 0 to n inclusive

        // Let the user enter a number
        System.out.print("Guess a number from 1 to 10: ");
        Integer guess = UserInputUtil.readInteger();

        // Check if the numbers match
        Boolean correct = guess.equals(randomNumber);

        // If the user's number matches the random number, they win!
        if (correct) {
            System.out.println(YOU_WIN);
        } else {
            System.out.println(YOU_LOSE);
        }
    }

    public static void main(String[] args) {
        guessWhatNumber();
    }
}
