package eca.exercises.SOFD;

import org.junit.Test;

import static org.junit.Assert.*;

public class SumOfDigitsTest {

    @Test
    public void shouldAddDigits() {
        Integer input = 12345;

        Integer result = SumOfDigits.sumDigits(input);

        Integer expected = 1 + 2 + 3 + 4 + 5;

        assertEquals(expected, result);
    }

}