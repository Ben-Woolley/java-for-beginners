package eca.exercises.HOLG.answers;

import java.util.Random;

import eca.util.UserInputUtil;

public class AnswersHOLG {

    public static void main(String[] args) {
                
        var score = 0; // Create a variable to track score, starting at 0
        var playerLost = false; // Create a variable to track if the player has lost the game

        var currentRoll = new Random().nextInt(6) + 1; // Make a first roll from 1 to 6

        while (!playerLost) {

            // Tell the player the dealer's roll, and ask them for higher or lower
            System.out.println("Dealer rolls: " + currentRoll);
            System.out.print("Higher (1) or lower (2): ");
            var guess = UserInputUtil.readInteger();

            // Roll the player's dice
            var playerRoll = new Random().nextInt(6) + 1;
            System.out.println("Player rolls: " + playerRoll);

            // Determine if the player won this round
            if (guess.equals(1) && playerRoll >= currentRoll) { // If they guessed higher, and their roll is higher or equal to the dealer's
                currentRoll = playerRoll; // The second roll is now the current roll
                score = score + 1; // Add 1 point to the score

                // And the loop repeats

            } else if (guess.equals(2) && playerRoll <= currentRoll) { // If they guessed lower, and their roll is or equal to the dealer's
                currentRoll = playerRoll; // The second roll is now the current roll
                score = score + 1; // Add 1 point to the score

                // And the loop repeats

            } else { // Otherwise, the player has lost
                playerLost = true; // Set playerLost to true, ending the while-loop
            }
        }
        
        // The loop is finished because playerLost is true, print the final score
        System.out.println("Game over! Score: " + score);
    }
}