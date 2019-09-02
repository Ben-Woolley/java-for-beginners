package eca.lessons.lesson2.exercises.PYCA;

import org.junit.Test;

import static org.junit.Assert.*;

public class PythagorasCalculationTest {

    @Test
    public void shouldCalculateFor1And2() {
        Double result = PythagorasCalculation.calculatePythagoras(1, 2);

        assertEquals(2.24, result, 0.1);
    }

    @Test
    public void shouldCalculateForEqualSidesAAndB() {
        Double result = PythagorasCalculation.calculatePythagoras(1, 1);

        assertEquals(1.41, result, 0.1);
    }

}