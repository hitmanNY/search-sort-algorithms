package jason.example.algorithm;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class StringManiulationTest {
    StringManipulation manni;

    @Before
    public void setup() {
        manni = new StringManipulation();
    }

    @Test
    public void testFibinacciGood() {
        List<Integer> expected = new ArrayList<>();
        expected.add(1);
        expected.add(1);
        expected.add(2);
        expected.add(3);
        expected.add(5);
        expected.add(8);

        assertEquals(expected, manni.getFibbinacciSequence(1, 1, 6));
    }

    @Test
    public void testReverseStringByCharGood() {
        String text = "this is the end";

        System.out.println("Reversed: " + manni.reverseStringByChar(text));
    }

    @Test
    public void testIsSubstringGood() {
        String sub = "this";
        String source = "this is the end";

        assertTrue(manni.isSubstring(sub, source));
    }

    @Test
    public void testIsSubstringGoodNotFound() {
        String sub = "dummy";
        String source = "this is the end";

        assertFalse(manni.isSubstring(sub, source));
    }

    // @Test
    public void testIsSubstringPatternMatcherGood() {
        String sub = "the ";
        String source = "this is the end";

        assertTrue(manni.isSubstringPatternMatch(sub, source));

    }

}
