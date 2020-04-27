package eca.exercises.LOTN.answers;

import eca.util.UserInputUtil;

/**
 * Also see {@link eca.exercises.LOTN.answers.AnswersLOTN2} for an alternative solution.
 * 
 * This solution stores the largest number in a variable, and only ever requires 2 comparisons to find the largest.
 */
public class AnswersLOTN {
    public static void main(String[] args) {
        // Create 3 number variables for comparison
        System.out.print("Enter your first number: ");
        var a = UserInputUtil.readDouble();
        System.out.print("Enter your second number: ");
        var b = UserInputUtil.readDouble();
        System.out.print("Enter your third number: ");
        var c = UserInputUtil.readDouble();

        // Determine which of the 3 numbers is the largest, print the result
        var largest = a; // Assume a is the largest for now
        if (a > b) {
            if (a > c) {
                // a is larger than b and c
                largest = a;
            } else {
                // a is larger than b, but less than c
                largest = c;
            }
        } else {
            if (b > c) {
                // b is larger than a and c
                largest = b;
            } else {
                // b is larger than a, but less than c
                largest = c;
            }
        }

        System.out.println("The largest of " + a + ", " + b + ", and " + c + " is " + largest);
    }
}