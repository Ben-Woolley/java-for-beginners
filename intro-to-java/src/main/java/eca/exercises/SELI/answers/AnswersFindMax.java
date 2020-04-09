package eca.exercises.SELI.answers;

import java.util.ArrayList;
import java.util.List;

public class AnswersFindMax {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        // Find and print the largest number in numbers
        Integer largest = numbers.get(0); // Pretend the first number is the largest

        // For each number in numbers
        for (Integer number : numbers) {

            // If that number is larger than what we think is the largest
            if (number > largest) {
                largest = number; // Replace largest with the current number
            }
        }

        System.out.println("The largest number in numbers is " + largest);
    }
}
