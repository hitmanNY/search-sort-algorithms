package jason.example.algorithm.sort;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class BubbleSortTest {
    private BubbleSort bsort;

    @Before
    public void setup() {
        bsort = new BubbleSort();
    }

    @Test
    public void testBubbleSortGoodEmptyInput() {
        List<Integer> expected = new ArrayList<>();
        List<Integer> response = new ArrayList<>();

        bsort.bubbleSort(response);
        assertEquals(expected, response);
    }

    @Test
    public void testBubbleSortGoodNullInput() {
        List<Integer> expected = null;
        List<Integer> response = null;

        bsort.bubbleSort(response);
        assertEquals(expected, response);
    }

    @Test
    public void testBubbleSortGood() {
        List<Integer> expected = new ArrayList<>();
        expected.add(1);
        expected.add(2);
        expected.add(3);
        expected.add(4);

        List<Integer> response = new ArrayList<>();
        response.add(2);
        response.add(3);
        response.add(4);
        response.add(1);

        bsort.bubbleSort(response);
        assertEquals(expected, response);

    }
}
