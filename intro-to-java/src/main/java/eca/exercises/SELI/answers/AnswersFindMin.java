package eca.exercises.SELI.answers;

import java.util.ArrayList;
import java.util.List;

public class AnswersFindMin {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        // Find and print the smallest number in numbers
        Integer smallest = numbers.get(0); // Pretend the first number is the smallest

        // For each number in numbers
        for (Integer number : numbers) {

            // If that number is smaller than what we think is the smallest
            if (number < smallest) {
                smallest = number; // Replace smallest with the current number
            }
        }

        System.out.println("The smallest number in numbers is " + smallest);
    }
}
