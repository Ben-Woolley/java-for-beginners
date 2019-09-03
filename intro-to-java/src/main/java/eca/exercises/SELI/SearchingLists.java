package eca.exercises.SELI;

import java.util.ArrayList;
import java.util.List;

public class SearchingLists {

    public static Integer findMin(List<Integer> numbers) {
        // Find and return the smallest number in numbers

        return 0; // Replace with your result
    }

    public static Integer findMax(List<Integer> numbers) {
        // Find and return the largest number in numbers

        return 0; // Replace with your result
    }

    public static Boolean contains(List<Integer> numbers, Integer toFind) {
        // Find toFind in numbers - return true if it exists, and false otherwise

        return false; // Replace with your result
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
