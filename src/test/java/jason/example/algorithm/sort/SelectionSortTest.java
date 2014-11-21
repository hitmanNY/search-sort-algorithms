package jason.example.algorithm.sort;

import org.junit.Before;
import org.junit.Test;

public class SelectionSortTest {
    private SelectionSort ssort;

    @Before
    public void setup() {
        ssort = new SelectionSort();
    }

    @Test
    public void testPlaypen() {
        int[] before = { 1, 2, 3 };

        System.out.println("Before: ");
        for (int i : before) {
            System.out.print(i + ", ");
        }
        System.out.println();

        modify(before);

        System.out.println("After: ");
        for (int i : before) {
            System.out.print(i + ", ");
        }
        System.out.println();

    }

    public void modify(int[] arr) {
        arr[2] = 999;
    }

    @Test
    public void testSelectionSortGood() {
        int[] unordered = { 1, 5, 9, 3 };

        System.out.println("PRE Ordered: ");
        for (int i : unordered) {
            System.out.print(i + ", ");
        }
        System.out.println();

        int[] response = ssort.selectionSort(unordered);

        System.out.println("Sorted: ");
        for (int i : response) {
            System.out.print(i + ", ");
        }
        System.out.println();

    }
}
