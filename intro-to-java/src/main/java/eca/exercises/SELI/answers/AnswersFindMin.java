package eca.exercises.SELI.answers;

import java.util.List;

public class AnswersFindMin {

    public static void main(String[] args) {
        var numbers = List.of(1, 2, 3, 4, 5);

        // Find and print the smallest number in numbers
        var smallest = numbers.get(0); // Pretend the first number is the smallest

        // For each number in numbers
        for (var number : numbers) {

            // If that number is smaller than what we think is the smallest
            if (number < smallest) {
                smallest = number; // Replace smallest with the current number
            }
        }

        System.out.println("The smallest number in numbers is " + smallest);
    }
}
