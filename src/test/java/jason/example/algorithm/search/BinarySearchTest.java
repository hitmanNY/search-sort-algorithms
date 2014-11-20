package jason.example.algorithm.search;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import jason.example.algorithm.search.BinarySearch;

import org.junit.Before;
import org.junit.Test;

public class BinarySearchTest {
    private BinarySearch bi;
    private int[] list = { 1, 2, 3, 4, 6, 7, 10 };

    @Before
    public void setup() {
        bi = new BinarySearch();
    }

    @Test
    public void testBinarySearchNotFoundGood() {
        assertFalse(bi.contains(list, 5));
    }

    @Test
    public void testBinarySearchFoundGood() {
        assertTrue(bi.contains(list, 7));
    }
}
