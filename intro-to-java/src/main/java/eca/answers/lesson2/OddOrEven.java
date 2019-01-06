package eca.answers.lesson2;

public class OddOrEven {

    public static void main(String[] args) {
        Integer numberToCheck = 11;

        /*
         * A number is even if it cleanly divides by 2.
         * This means that numberToCheck modulus 2 (remaineder of integer division)
         *  should be 0
         */
        Boolean isEven = numberToCheck % 2 == 0;

        System.out.println(isEven);
    }
}
