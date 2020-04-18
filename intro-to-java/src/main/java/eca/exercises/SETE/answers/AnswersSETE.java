package eca.exercises.SETE.answers;

public class AnswersSETE {

    public static void main(String[] args) {
        // Choose your a, b, and expected total
        var a = 10;
        var b = 7;
        var expected = 17;

        // Determine whether the sum of a and b is equal to the expected value
        var result = a + b; // Calculate a + b
        var isResultSameAsExpected = result == expected; // Compare the result to the expected value

        // Print the result
        System.out.println("It is " + isResultSameAsExpected + " that " + a + " + " + b + " = " + expected);
    }
}
