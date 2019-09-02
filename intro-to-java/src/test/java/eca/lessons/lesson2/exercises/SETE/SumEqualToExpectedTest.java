package eca.lessons.lesson2.exercises.SETE;

import org.junit.Test;

import static org.junit.Assert.*;

public class SumEqualToExpectedTest {

    @Test
    public void shouldReturnTrueForMatchingResult() {
        Integer a = 5;
        Integer b = 2;
        Integer expected = 7;

        Boolean result = SumEqualToExpected.sumEqualToExpected(a, b, expected);

        assertTrue(result);
    }

    @Test
    public void shouldReturnFalseForNonMatchingResult() {
        Integer a = 5;
        Integer b = 2;
        Integer expected = 10;

        Boolean result = SumEqualToExpected.sumEqualToExpected(a, b, expected);

        assertFalse(result);
    }
}