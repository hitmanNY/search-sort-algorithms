package jason.example.algorithm.search;

public class BinarySearch {

    public boolean contains(int[] array, int objectToLocate) {
        int max = 0;
        int mid = 0;

        if (array.length == 0) {
            return false;
        }

        int low = 0;
        int high = array.length - 1;

        while (low <= high) {

            // take an array, slice it roughly in half
            mid = (low + high) / 2;

            // does it match?
            if (objectToLocate > array[mid]) {
                low = mid + 1;
            } else if (objectToLocate < array[mid]) {
                high = mid - 1;
            } else {
                return true;
            }
        }
        return false;
    }
}
