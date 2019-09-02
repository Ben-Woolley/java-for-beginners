package eca.lessons.lesson2.exercises.BACA.answers;

import eca.util.UserInputUtil;

public class AnswersBACA {


    public static void calculate() {
        // Use UserInputUtil to take in Integers a and b, and String operator
        Integer a = UserInputUtil.readInteger();
        Integer b = UserInputUtil.readInteger();
        String operation = UserInputUtil.readLine();

        // Determine which math operator to do based on the operator String
        if (operation.equals("+")) {
            // Then perform that operation on a and b
            Integer result = a + b;
            // Print the math operation and the result e.g. 1 + 2 = 3
            System.out.println(a + " " + operation + " " + b + " = " + result);
        } else if (operation.equals("-")) {
            Integer result = a - b;
            System.out.println(a + " " + operation + " " + b + " = " + result);
        } else if (operation.equals("/")) {
            Integer result = a / b;
            System.out.println(a + " " + operation + " " + b + " = " + result);
        } else if (operation.equals("*")) {
            Integer result = a * b;
            System.out.println(a + " " + operation + " " + b + " = " + result);
        } else {
            System.out.println("Unknown operator " + operation);
        }
    }

    public static void main(String[] args) {
        calculate();
    }

}
