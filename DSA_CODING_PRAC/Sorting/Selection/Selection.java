package Sorting.Selection;

import java.util.Arrays;

public class Selection {

    public static void main(String[] args) {
        int[] arr = {5, 4, 1, 3, 2};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selection(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length - i - 1;
            int maxIndex = greater(arr, last);

            int temp = arr[maxIndex];
            arr[maxIndex] = arr[last];
            arr[last] = temp;
        }
    }

    static int greater(int[] arr, int end) {
        int maxIndex = 0;
        for (int i = 1; i <= end; i++) {
            if (arr[i] > arr[maxIndex]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }
}
