package eca.exercises.MCMP.answers;

import java.util.Objects;

public class AnswersMCMP {

    public static void main(String[] args) {
        // Create 2 Integer variables a and b
        var a = 10;
        var b = 2;

        /* Print the result of:
            - Equal to
            - Greater than
            - Greater than or equal
            - Less than
            - Less than or equal
           between a and b.
         */
        System.out.println(a == b);      // Equality
        System.out.println(Objects.equals(a, b)); // Equality (that works for any type)
        System.out.println(a > b); // Greater than
        System.out.println(a < b); // Less than
        System.out.println(a >= b); // Greater than or equal to
        System.out.println(a <= b); // Less than or equal to
    }
}
