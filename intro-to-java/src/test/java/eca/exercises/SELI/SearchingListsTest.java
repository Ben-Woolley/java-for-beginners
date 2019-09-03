package eca.exercises.SELI;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class SearchingListsTest {

    private List<Integer> numbers = Arrays.asList(
            1,
            2,
            3,
            4,
            5
    );

    @Test
    public void shouldGetSmallestNumber() {
        Integer result = SearchingLists.findMin(numbers);

        assertEquals(new Integer(1), result);
    }

    @Test
    public void shouldGetLargestNumber() {
        Integer result = SearchingLists.findMax(numbers);

        assertEquals(new Integer(5), result);
    }

    @Test
    public void shouldReturnTrueIfListContainsNumber() {
        Boolean result = SearchingLists.contains(numbers, 3);

        assertTrue(result);
    }

    @Test
    public void shouldReturnFalseIfListDoesNotContainNumber() {
        Boolean result = SearchingLists.contains(numbers, 0);

        assertFalse(result);
    }

}