package eca.exercises.SELI.answers;

import java.util.ArrayList;
import java.util.List;

public class AnswersFindNumber {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        Integer numberToFind = 4;

        // Find and print whether the numberToFind is in numbers
        Boolean foundNumber = false;
        for (Integer number : numbers) {
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
