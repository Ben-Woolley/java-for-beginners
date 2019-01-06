package eca.answers.lesson2;

public class SumOfDigits {

    public static void main(String[] args) {
        // Define our input
        Integer numberToGetSumOfDigits = 12345;
        // Convert it to a String so we can get the individual characters
        String numberAsString = numberToGetSumOfDigits.toString();
        // Split the String on nothing, giving us an *array* of individual numbers as Strings
        String[] individualCharacters = numberAsString.split("");

        // Create a variable to add to
        Integer sumOfDigits = 0;
        /*
         * For each String character, convert it back to an integer and add to the sumOfDigits.
         */
        for (String characterNumber : individualCharacters) {
            Integer characterAsInteger = Integer.valueOf(characterNumber);
            sumOfDigits += characterAsInteger;
        }

        System.out.println("Sum of digits of " + numberToGetSumOfDigits + " = " + sumOfDigits);
    }
}
