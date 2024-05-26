package Arrays;

public class MaxMinBetween {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};

        int start = 2;
        int end = 6;

        System.out.println("Maximum in between range: " + max(arr, start, end));
    }

    static int max(int[] arr, int start, int end) {
        int max = Integer.MIN_VALUE;
        for (int i = start; i <= end; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
