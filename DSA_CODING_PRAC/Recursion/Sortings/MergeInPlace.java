package Recursion.Sortings;

import java.util.Arrays;

public class MergeInPlace {

    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        mergeSortInplace(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));
    }

    static void mergeSortInplace(int[] arr, int s, int e) {
        // Base case: If the array section has one or zero elements, it's sorted
        if (e - s == 1) {
            return;
        }

        // Find the midpoint
        int mid = s + (e - s) / 2;

        // Sort the first half
        mergeSortInplace(arr, s, mid);

        // Sort the second half
        mergeSortInplace(arr, mid, e);

        // Merge the sorted halves
        mergeInplace(arr, s, mid, e);
    }

    static void mergeInplace(int[] arr, int s, int m, int e) {
        int[] mix = new int[e - s]; // Temporary array to hold merged elements

        int i = s; // Pointer for the left half
        int j = m; // Pointer for the right half
        int k = 0; // Pointer for the temporary array

        // Merge elements in sorted order
        while (i < m && j < e) {
            if (arr[i] < arr[j]) {
                mix[k] = arr[i];
                i++;
            } else {
                mix[k] = arr[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements from the left half
        while (i < m) {
            mix[k] = arr[i];
            i++;
            k++;
        }

        // Copy remaining elements from the right half
        while (j < e) {
            mix[k] = arr[j];
            j++;
            k++;
        }

        // Copy the merged elements back to the original array
        for (int l = 0; l < mix.length; l++) {
            arr[s + l] = mix[l];
        }
    }
}
