public class InsertionSort {
    public static void insertionSort(int arr[]) {
        // traversing provided array
        for (int i = 1; i < arr.length; i++) {
            // selecting elements to compare
            int curr = arr[i];
            int j = i - 1;

            // comparing current element with previous element
            while (j >= 0 && curr < arr[j]) {
                arr[j + 1] = arr[j];
                --j;
            }

            // solving out-of-order elements.
            arr[j + 1] = curr;
        }
    }
}
