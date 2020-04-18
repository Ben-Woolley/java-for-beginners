package eca.exercises.SELI.answers;

import java.util.List;

public class AnswersFindNumber {

    public static void main(String[] args) {
        var numbers = List.of(1, 2, 3, 4, 5);

        var numberToFind = 4;

        // Find and print whether the numberToFind is in numbers
        var foundNumber = false;
        for (var number : numbers) {
            if (number.equals(numberToFind)) {
                foundNumber = true;
            }
        }

        if (foundNumber == true) {
            System.out.println(numberToFind + " is in the list");
        } else {
            System.out.println(numberToFind + " is not in the list");
        }
    }
}
