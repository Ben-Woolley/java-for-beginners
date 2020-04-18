package eca.exercises.PRLI.answers;

import java.util.List;

public class AnswersPRLI {

    public static void main(String[] args) {
        // Make a List of names of your favourite foods (from most to least favourite)
        var favouriteFood = List.of("Ramen", "Burger", "Ice Cream", "Pizza");

        // Print each food in the list on one line each
        for (var food : favouriteFood) {
            System.out.println(food);
        }

        // Print each food as part of a sentence
        for (var food : favouriteFood) {
            System.out.println("I love " + food);
        }

        // Print each food with its number rank, corresponding to the position in the list
        // for (an Integer index from 0 to the size of the favouriteFood list, incrementing by 1
        for (var index = 0; index < favouriteFood.size(); index++) {
            var rank = index + 1; // This makes our rank start from 1 instead of 0
            System.out.println("Rank " + rank + ": " + favouriteFood.get(index)); // Get the food from the list at position of the index
        }
    }
}
