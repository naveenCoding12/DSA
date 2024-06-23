package Sorting.Cycle;

import java.util.Arrays;

public class FirstMissing {

    public static void main(String[] args) {
        int[] arr = {1,2};
        sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("First missing positive number: " + firstMissing(arr));
    }

    static void sort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            // Check if arr[i] is a positive number within the array bounds and not in its correct position
            if (arr[i] > 0 && arr[i] != arr[correct]) {
                int temp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = temp;
            } else {
                i++;
            }
        }
    }

    static int firstMissing(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != i + 1) {
                return i + 1;
            }
        }
        return arr.length + 1; // If all positions are correct, the missing number is next after the last index
    }
}
