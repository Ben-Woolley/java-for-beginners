package eca.exercises.PRLI.answers;

import java.util.ArrayList;
import java.util.List;

public class AnswersPRLI {

    public static void main(String[] args) {
        // Make a List of names of your favourite foods (from most to least favourite)
        List<String> favouriteFood = new ArrayList<>();
        favouriteFood.add("Ramen");
        favouriteFood.add("Burger");
        favouriteFood.add("Ice Cream");
        favouriteFood.add("Pizza");

        // Print each food in the list on one line each
        for (String food : favouriteFood) {
            System.out.println(food);
        }

        // Print each food as part of a sentence
        for (String food : favouriteFood) {
            System.out.println("I love " + food);
        }

        // Print each food with its number rank, corresponding to the position in the list
        // for (an Integer index from 0 to the size of the favouriteFood list, incrementing by 1
        for (Integer index = 0; index < favouriteFood.size(); index++) {
            Integer rank = index + 1; // This makes our rank start from 1 instead of 0
            System.out.println("Rank " + rank + ": " + favouriteFood.get(index)); // Get the food from the list at position of the index
        }
    }
}
