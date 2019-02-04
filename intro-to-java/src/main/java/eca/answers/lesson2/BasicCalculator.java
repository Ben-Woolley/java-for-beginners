package eca.answers.lesson2;

import eca.util.UserInputUtil;

public class BasicCalculator {

    public static void main(String[] args) {
        // Store each of the numbers and the operator in variables for use later
        Double firstNumber = UserInputUtil.readDouble();
        Double secondNumber = UserInputUtil.readDouble();

        String operator = UserInputUtil.readLine().trim(); // we are using String.trim() to get rid of spaces around the operator

        // Create a variable **for use later** - it currently contains nothing (null)
        Double result = null;

        // using chained if-else statements, check if the string is equal to one of the expected mathematical symbols
        // Set the result one we find a matching operator
        // If we don't find an operator, result will still be null
        if (operator.equals("+")) {
            result = firstNumber + secondNumber;

        } else if (operator.equals("-")) {
            result = firstNumber - secondNumber;

        } else if (operator.equals("*")) {
            result = firstNumber * secondNumber;

        } else if (operator.equals("/")) {
            result = firstNumber / secondNumber;

        }

        // Check if a result was calculated, if so, pretty-print the string - if not, print the error.
        if (result != null) {
            System.out.println(firstNumber + " " + operator + " " + secondNumber + " = " + result);

        } else {
            System.out.println("Unsupported mathematical operator " + operator);
        }
    }
}
