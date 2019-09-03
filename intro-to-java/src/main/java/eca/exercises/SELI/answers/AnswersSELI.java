package eca.exercises.SELI.answers;

import java.util.ArrayList;
import java.util.List;

public class AnswersSELI {

    public static Integer findMin(List<Integer> numbers) {
        // Find and return the smallest number in numbers

        Integer smallest = numbers.get(0); // Pretend the first number is the smallest

        // For each number in numbers
        for (Integer number : numbers) {

            // If that number is smaller than what we think is the smallest
            if (number < smallest) {
                smallest = number; // Replace smallest with the current number
            }
        }

        return smallest;
    }

    public static Integer findMax(List<Integer> numbers) {
        // Find and return the largest number in numbers


        Integer largest = numbers.get(0); // Pretend the first number is the largest

        // For each number in numbers
        for (Integer number : numbers) {

            // If that number is larger than what we think is the largest
            if (number > largest) {
                largest = number; // Replace largest with the current number
            }
        }

        return largest;    }

    public static Boolean contains(List<Integer> numbers, Integer toFind) {
        // Find toFind in numbers - return true if it exists, and false otherwise

        // Keep track of whether it is found outside of the loop
        Boolean foundNumber = false;
        for (Integer number : numbers) {
            if (number.equals(toFind)) {
                foundNumber = true;
            }
        }

        return foundNumber;
    }

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        System.out.println("Min: " + findMin(numbers));
        System.out.println("Max: " + findMax(numbers));
        System.out.println("Min: " + contains(numbers, 6));
    }
}
