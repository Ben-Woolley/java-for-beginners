package eca.lessons.lesson2.exercises.OOEV;

import org.junit.Test;

import static org.junit.Assert.*;

public class OddOrEvenTest {

    @Test
    public void shouldReturnTrueForOddNumber() {
        Boolean result = OddOrEven.isOdd(5);

        assertTrue(result);
    }

    @Test
    public void shouldReturnFalseForOddNumber() {
        Boolean result = OddOrEven.isOdd(10);

        assertFalse(result);
    }

    @Test
    public void shouldReturnFalseForZero() {
        Boolean result = OddOrEven.isOdd(10);

        assertFalse(result);
    }

    @Test
    public void shouldWorkForNegativeNumbers() {
        Boolean result = OddOrEven.isOdd(-10);

        assertFalse(result);
    }

}