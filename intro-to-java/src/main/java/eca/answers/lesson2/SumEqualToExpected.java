package eca.answers.lesson2;

public class SumEqualToExpected {

    public static void main(String[] args) {
        // create out input and expected variables
        Integer a = 1;
        Integer b = 2;
        Integer expected = 3;

        // calculate the sum
        Integer sum = a + b;
        // check if it matches the expected value
        Boolean sumMatchesExpected = sum == expected;

        // print the boolean result
        System.out.println(sumMatchesExpected);
    }
}
