package eca.answers.lesson2;

import java.util.ArrayList;
import java.util.List;

public class SearchingLists {

    public static void main(String[] args) {
        // Create a List of Integers as a new ArrayList, and add some numbers
        List<Integer> someNumbers = new ArrayList<>();
        someNumbers.add(3);
        someNumbers.add(1);
        someNumbers.add(4);
        someNumbers.add(5);
        someNumbers.add(7);
        someNumbers.add(6);
        someNumbers.add(10);
        someNumbers.add(8);
        someNumbers.add(2);
        someNumbers.add(9);

        // Create a variable outside the loop to store the largest found number
        // Set it to the first in the list so we know the largest will come from the list
        Integer largest = someNumbers.get(0);
        for (Integer number : someNumbers) {

            /*
             * for each number in the list, see if its larger than the currently known largest,
             *  if it is, replace largest with the current number.
             */
            if (largest < number) {
                largest = number;
            }
        }
        System.out.println("Largest number = " + largest);

        // Create a variable outside the loop to store the smallest found number
        // Set it to the first in the list so we know the smallest will come from the list
        Integer smallest = someNumbers.get(0);
        for (Integer number : someNumbers) {

            /*
             * for each number in the list, see if its smaller than the currently known smallest,
             *  if it is, replace smallest with the current number.
             */
            if (smallest > number) {
                smallest = number;
            }
        }
        System.out.println("Smallest number = " + smallest);


        Integer numberToFind = 4;
        // Create a variable outside the loop to record if we find the number
        Boolean numberToFindExists = false;
        for (Integer number : someNumbers) {

            /*
             * for each number in the list, see if its equal to the wanted number,
             *  if it is, set the numberToFindExists variable to true.
             */
            if (number.equals(numberToFind)) {
                numberToFindExists = true;

                /*
                 * This is an optimization, as soon as we find the number,
                 *  we stop looping through by *break*-ing out of it.
                 */
                break;
            }
        }
        System.out.println("Found " + numberToFind + " = " + numberToFindExists);

    }
}
