package eca.exercises.RPSG.answers;

import java.util.Random;

import eca.util.UserInputUtil;

public class AnswersRPSG2 {
    public static void main(String[] args) {
        
        // Instead of a boolean, we now need to track the win count of the player and opponent
        var playerScore = 0;
        var opponentScore = 0;

        // In a best of 3, we keep playing until either player has a score of 2
        // We don't need to check for a total of 3, because a score of 2 guarantees a win
        while (playerScore < 2 && opponentScore < 2) {

            // Get the player's move
            System.out.println("Make your move! (1 = rock, 2 = paper, 3 = scissors)");
            System.out.println("Your choice: ");
            var playerMove = UserInputUtil.readInteger();

            // Calculate the opponent's move
            var opponentMove = new Random().nextInt(3) + 1;

            // Calculate the winner
            if (playerMove == opponentMove) { // It's a draw (i.e. both players chose the same)
                System.out.println("It's a draw! Go again!");
            }
            // The next three if-statements check for the three win-conditions for the player
            else if (playerMove == 1 && opponentMove == 3) { // Rock beats scissors
                System.out.println("Player wins the round with " + playerMove + " against " + opponentMove); // Announce the player as the winner
                playerScore = playerScore + 1; // Instead of setting the Boolean, we increment the winner's counter

            } else if (playerMove == 2 && opponentMove == 1) { // Paper beats rock
                System.out.println("Player wins the round with " + playerMove + " against " + opponentMove);
                playerScore = playerScore + 1;

            } else if (playerMove == 3 && opponentMove == 2) { // Scissors beats paper
                System.out.println("Player wins the round with " + playerMove + " against " + opponentMove);
                playerScore = playerScore + 1;

            } else { // If it's not a draw, and the player hasn't won, then the player must have lost
                System.out.println("Opponent wins the round with " + opponentMove + " against " + playerMove); // Announce the opponent as the winner
                opponentScore = opponentScore + 1;

            }
        }

        // We now need to announce the winner of the 3 rounds
        // The winner is the player with a score of 2
        if (playerScore == 2) {
            System.out.println("Player wins the best of 3!");
        } else { 
            // If the player didn't win, the opponent must have won
            System.out.println("Opponent wins the best of 3!");
        }
    }
}