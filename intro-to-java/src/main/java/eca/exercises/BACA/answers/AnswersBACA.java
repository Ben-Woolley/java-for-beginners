package eca.exercises.BACA.answers;

import eca.util.UserInputUtil;

public class AnswersBACA {

    public static void main(String[] args) {
        // Use UserInputUtil to take in Integers a and b, and String operator
        System.out.print("First number: ");
        var a = UserInputUtil.readInteger();

        System.out.print("Second number: ");
        var b = UserInputUtil.readInteger();

        System.out.print("Operation: ");
        var operation = UserInputUtil.readLine();

        // Determine which math operator to do based on the operator String
        if (operation.equals("+")) {
            // Then perform that operation on a and b
            var result = a + b;
            // Print the math operation and the result e.g. 1 + 2 = 3
            System.out.println(a + " " + operation + " " + b + " = " + result);
        } else if (operation.equals("-")) {
            var result = a - b;
            System.out.println(a + " " + operation + " " + b + " = " + result);
        } else if (operation.equals("/")) {
            var result = a / b;
            System.out.println(a + " " + operation + " " + b + " = " + result);
        } else if (operation.equals("*")) {
            var result = a * b;
            System.out.println(a + " " + operation + " " + b + " = " + result);
        } else {
            System.out.println("Unknown operator " + operation);
        }
    }

}
