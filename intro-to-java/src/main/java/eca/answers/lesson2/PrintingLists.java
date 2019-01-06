package eca.answers.lesson2;

import java.util.ArrayList;
import java.util.List;

public class PrintingLists {

    public static void main(String[] args) {
        /*
         * We're creating a List that contains String, which is denoted as List<String>.
         * We're using an *implementation* of List called ArrayList, but you could use any other since
         *  the type List guarantees that any implementation does everything we need it to.
         */
        List<String> myFavouriteFoods = new ArrayList<>();
        myFavouriteFoods.add("Roast dinner");
        myFavouriteFoods.add("Ice cream");
        myFavouriteFoods.add("Burger");
        myFavouriteFoods.add("Spaghetti carbonara");
        myFavouriteFoods.add("Loaded Nachos");

        /*
         * To show off more than 1 for loop type, I have turned each part into a function
         *  and called them here. It's effectively the same as having their code blocks pasted here.
         */
        part1(myFavouriteFoods);
        part2(myFavouriteFoods);
    }

    /*
     * This function uses the for-each loop to go through each item 'food' in the list.
     */
    private static void part1(List<String> myFavouriteFoods) {
        for (String food : myFavouriteFoods) {
            System.out.println("If I could, I would eat " + food + " for every meal");
        }
    }

    /*
     * This function uses the traditional for to use the list index as the rank.
     * Lists start at index 0, so the first item is at index 0, explaining the .get(rank - 1)
     */
    private static void part2(List<String> myFavouriteFoods) {
        for (int rank = 1; rank < myFavouriteFoods.size() + 1; rank++) {
            System.out.println("Rank " + rank + ": " + myFavouriteFoods.get(rank - 1));
        }
    }
}
