package eca.lessons.lesson2.exercises.SETE.answers;

public class AnswersSETE {

    public Boolean sumEqualToExpected(Integer a, Integer b, Integer expected) {
        Integer result = a + b; // Calculate a + b
        Boolean isResultSameAsExpected = result.equals(expected); // Compare the result to the expected value
        return isResultSameAsExpected; // Return the result of that comparison
    }
}
