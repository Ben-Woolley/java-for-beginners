package eca.exercises.SOFD.answers;

public class AnswersSOFD {

    public static void main(String[] args) {
        // Compute the num of the individual digits in the Integer toSum

        var toSum = 12345;

        // To be able to get each digit, we need to convert the number to a String
        var numberAsString = String.valueOf(toSum);
        // We can then split that string on every character, to get the individual digits
        var digits = numberAsString.split("");

        // Keep track of the total outside the loop
        var total = 0;

        // For each digit in digits
        for (var digit : digits) {
            // Convert the digit to an Integer
            Integer digitAsInteger = Integer.parseInt(digit);

            // Add it to the total
            total = total + digitAsInteger;
        }

        System.out.println("The sum of the digits in " + toSum + " is " + total);
    }
}
