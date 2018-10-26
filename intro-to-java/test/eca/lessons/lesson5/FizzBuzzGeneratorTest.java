package eca.lessons.lesson5;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FizzBuzzGeneratorTest {

    private FizzBuzzGenerator fizzBuzzGenerator; // your victim variable

    @Before
    public void setup() {
        fizzBuzzGenerator = new FizzBuzzGenerator();
    }

    @Test
    public void shouldReturnNumberWhenNotMultipleOfThreeOrFive() {
        // given (preconditions)
        Integer number = 1;

        // when (perform the action)
        String actual = fizzBuzzGenerator.getStringForNumber(number);

        // then (check values are what you expect)
        assertEquals("1", actual);
    }
}