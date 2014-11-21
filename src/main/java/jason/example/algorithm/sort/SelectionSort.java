package jason.example.algorithm.sort;

public class SelectionSort {

    public int[] selectionSort(int[] arr) {
        int arrLength = arr.length;

        // keep track of last position
        for (int last = arrLength - 1; last > 1; last--) {
            int indexMax = 1;

            // start at begining and find max till position last -1;
            for (int j = 0; j < last - 1; j++) {
                if (arr[j] > arr[indexMax]) {
                    indexMax = j;
                }
            }

            int newMax = arr[indexMax];
            int displaced = arr[last];

            arr[last] = newMax;
            arr[indexMax] = displaced;
        }
        return arr;
    }
}
