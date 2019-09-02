package eca.lessons.lesson2.exercises.MCMP.answers;

public class AnswersMCMP {

    public static void main(String[] args) {
        // Create 2 Integer variables a and b
        Integer a = 10;
        Integer b = 2;

        /* Print the result of:
            - Equal to
            - Greater than
            - Greater than or equal
            - Less than
            - Less than or equal
           between a and b.
         */
        System.out.println(a == b);      // Equality
        System.out.println(a.equals(b)); // Equality (that works for any type)
        System.out.println(a > b); // Greater than
        System.out.println(a >= b); // Greater than or equal to
        System.out.println(a < b); // Less than
        System.out.println(a <= b); // Less than or equal to
    }
}
