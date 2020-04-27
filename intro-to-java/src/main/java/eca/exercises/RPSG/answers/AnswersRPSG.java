package eca.exercises.RPSG.answers;

import java.util.Random;

import eca.util.UserInputUtil;

public class AnswersRPSG {
    public static void main(String[] args) {

        var noWinner = true; // A variable to track when a winner is found

        while (noWinner) {

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
                System.out.println("Player wins with " + playerMove + " against " + opponentMove); // Announce the player as the winner
                noWinner = false; // Update noWinner now someone has won, stopping the loop

            } else if (playerMove == 2 && opponentMove == 1) { // Paper beats rock
                System.out.println("Player wins with " + playerMove + " against " + opponentMove);
                noWinner = false;

            } else if (playerMove == 3 && opponentMove == 2) { // Scissors beats paper
                System.out.println("Player wins with " + playerMove + " against " + opponentMove);
                noWinner = false;

            } else { // If it's not a draw, and the player hasn't won, then the player must have lost
                System.out.println("Opponent wins with " + opponentMove + " against " + playerMove); // Announce the opponent as the winner
                noWinner = false;

            }
        }
    }
}