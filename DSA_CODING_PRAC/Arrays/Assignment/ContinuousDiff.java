package Arrays.Assignment;

import java.util.Arrays;

public class ContinuousDiff {

    public static void main(String[] args) {

        int[] arr = {-4,-3,-2,-1,4,3,2};

        int output = highestAltitude(arr);
        System.out.println(output);
    }

    public static int highestAltitude(int[] arr) {

        int[] diff_Array = new int[arr.length];

        diff_Array[0] = 0;

        for (int i = 1; i < arr.length; i++) {
            diff_Array[i] = arr[i - 1] + diff_Array[i - 1];

        }

        int max = maxArr(diff_Array);

        return max;
    }

    public static int maxArr(int[] arr) {

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }

        }
        return max;

    }
}