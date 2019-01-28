package eca.answers.lesson2;

import eca.util.UserInputUtil;

import java.util.Random;

public class GuessWhatNumber {

    public static void main(String[] args) {

        // Generate a random integer from 0 to 9 (nextInt's argument is exclusive upper bound) and add 1.
        Integer secretNumber = new Random().nextInt(10) + 1;

        // Ask the user for input with some prompt
        System.out.print("I have a secret number, what is it? : ");

        // Take an integer using UserInputUtil - this will throw an exception if you enter a non-integer.
        Integer guess = UserInputUtil.readInteger();

        // check if secretNumber == guess in an if-else
        if (secretNumber.equals(guess)) {
            System.out.println("You win!");
        } else {
            System.out.println("You lose!");
        }
    }
}
