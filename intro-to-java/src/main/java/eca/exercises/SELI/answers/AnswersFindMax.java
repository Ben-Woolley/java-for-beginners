package eca.exercises.SELI.answers;

import java.util.List;

public class AnswersFindMax {

    public static void main(String[] args) {
        var numbers = List.of(1, 2, 3, 4, 5);

        // Find and print the largest number in numbers
        var largest = numbers.get(0); // Pretend the first number is the largest

        // For each number in numbers
        for (var number : numbers) {

            // If that number is larger than what we think is the largest
            if (number > largest) {
                largest = number; // Replace largest with the current number
            }
        }

        System.out.println("The largest number in numbers is " + largest);
    }
}
