package Recursion.Sortings;

import java.util.Arrays;

public class Insertion {

    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 1};
        insertionSort(arr, arr.length, 1);
        System.out.println(Arrays.toString(arr));
    }

    static void insertionSort(int[] arr, int n, int i) {
        // Base case: When all elements are placed correctly
        if (i == n) {
            return;
        }

        // Insert the current element at index `i` into its correct position
        insert(arr, i, i - 1);

        // Recursive call for the next element
        insertionSort(arr, n, i + 1);
    }

    static void insert(int[] arr, int current, int prev) {
        // Base case: If at the beginning of the array or the correct position is found
        if (prev < 0 || arr[prev] <= arr[current]) {
            return;
        }

        // Swap to move the current element to its correct position
        int temp = arr[prev];
        arr[prev] = arr[prev + 1];
        arr[prev + 1] = temp;

        // Recursive call to continue shifting
        insert(arr, prev, prev - 1);
    }
}
