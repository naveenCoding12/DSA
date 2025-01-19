package Recursion.Sortings;

import java.util.Arrays;

public class Bubble {

    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 1};
        bubbleSort(arr, arr.length - 1, 0);
        System.out.println(Arrays.toString(arr));
    }

    static void bubbleSort(int[] arr, int r, int c) {
        // Base case: When no more rows to process
        if (r == 0) {
            return;
        }

        // If within the current row
        if (c < r) {
            // Swap if the current element is greater than the next
            if (arr[c] > arr[c + 1]) {
                int temp = arr[c];
                arr[c] = arr[c + 1];
                arr[c + 1] = temp;
            }
            // Move to the next column
            bubbleSort(arr, r, c + 1);
        } else {
            // After finishing a row, move to the next row
            bubbleSort(arr, r - 1, 0);
        }
    }
}
