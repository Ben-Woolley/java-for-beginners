package eca.answers.lesson2;

public class NTimesTable {

    public static void main(String[] args) {
        // to make sure it works for all numbers, keep our example in a variable
        Integer numberForTimesTable = 12;

        // Create a loop with a counter that starts at 1 and ends at 10 (only runs while currentMultiplier is less than 11
        for (Integer currentMultiplier = 1; currentMultiplier < 11; currentMultiplier ++) {

            // Multiply the numberForTimesTable by the currentMultiplier to get the result for this run in the loop
            System.out.println(currentMultiplier + " X " + numberForTimesTable + " = " + currentMultiplier * numberForTimesTable);
        }
    }
}
