package jason.example.algorithm.sort;

import java.util.List;

public class BubbleSort {

    public void bubbleSort(List<Integer> source) {
        if (source == null || source.isEmpty()) {
            return;
        }

        int max = source.size();
        boolean swapped = true;

        while (swapped) {
            int performedSwaps = 0;
            for (int a = 0; a < max; a++) {
                int b = a + 1;

                if (b >= max) {
                    break;
                }

                Integer intA = source.get(a);
                Integer intB = source.get(b);
                if (intA > intB) {
                    Integer tempB = new Integer(intA);
                    Integer tempA = new Integer(intB);

                    source.remove(a);
                    source.add(a, tempA);
                    source.remove(b);
                    source.add(b, tempB);

                    performedSwaps++;
                }
            }
            if (performedSwaps == 0) {
                swapped = false;
            }
        }
    }
}
