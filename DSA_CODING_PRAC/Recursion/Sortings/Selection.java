package Recursion.Sortings;

import java.util.Arrays;

public class Selection {

    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 1};
        selectionSort(arr, arr.length, 0, 0);
        System.out.println(Arrays.toString(arr));
    }

    static void selectionSort(int[] arr, int r, int c, int max) {
        // Base case: When the entire array is sorted
        if (r == 0) {
            return;
        }

        // If within the current row
        if (c < r) {
            // Find the index of the maximum element in the current row
            if (arr[c] > arr[max]) {
                selectionSort(arr, r, c + 1, c);
            } else {
                selectionSort(arr, r, c + 1, max);
            }
        } else {
            // Swap the maximum element found with the last element in the current row
            int temp = arr[max];
            arr[max] = arr[r - 1];
            arr[r - 1] = temp;

            // Move to the next row
            selectionSort(arr, r - 1, 0, 0);
        }
    }
}
