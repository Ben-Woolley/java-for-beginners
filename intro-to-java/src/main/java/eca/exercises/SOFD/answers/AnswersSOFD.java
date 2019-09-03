package eca.exercises.SOFD.answers;

public class AnswersSOFD {

    public static Integer sumDigits(Integer toSum) {
        // Compute the num of the individual digits in the Integer toSum

        // To be able to get each digit, we need to convert the number to a String
        String numberAsString = toSum.toString();
        // We can then split that string on every character, to get the individual digits
        String[] digits = numberAsString.split("");

        // Keep track of the total outside the loop
        Integer total = 0;

        // For each digit in digits
        for (String digit : digits) {
            // Convert the digit to an Integer
            Integer digitAsInteger = Integer.parseInt(digit);

            // Add it to the total
            total = total + digitAsInteger;
        }

        return total;
    }

    public static void main(String[] args) {
        System.out.println(sumDigits(12345));
    }
}
