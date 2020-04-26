package eca.exercises.LOTN.answers;

import eca.util.UserInputUtil;

/**
 * Also see {@link eca.exercises.LOTN.answers.AnswersLOTN} for an alternative solution.
 * 
 * We've intentionally not used a variable for the largest to demonstrate the alternative.
 * 
 * This solution's comparisons are easier to read, but some numbers are more expensive to calculate than others.
 * Worst case is 4 comparisons, vs the constant 2 of the alternative solution.
 * This is readability vs efficiency.
 */
public class AnswersLOTN2 {
    public static void main(String[] args) {
        // Create 3 number variables for comparison
        System.out.print("Enter your first number: ");
        var a = UserInputUtil.readDouble();
        System.out.print("Enter your second number: ");
        var b = UserInputUtil.readDouble();
        System.out.print("Enter your third number: ");
        var c = UserInputUtil.readDouble();

        // Determine which of the 3 numbers is the largest, print the result

        if (a > b && a > c) { // a is larger than b and c
            System.out.println("The largest of " + a + ", " + b + ", and " + c + " is " + a);

        } else if (b > a && b > c) { // b is larger than a and c
            System.out.println("The largest of " + a + ", " + b + ", and " + c + " is " + b);

        } else { // if the other conditions aren't true, then c must be larger than a and b
            System.out.println("The largest of " + a + ", " + b + ", and " + c + " is " + c);

        }
    }
}