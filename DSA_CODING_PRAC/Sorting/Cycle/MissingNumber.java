package Sorting.Cycle;

public class MissingNumber {

    public static void main(String[] args) {

        int[] arr = {9, 2, 6, 5, 1, 7, 3, 0, 4};
        sort(arr);
        int output = missing(arr);
        System.out.println("Missing number: " + output);


    }

    static void sort(int[] arr) {

        int i = 0;
        while (i < arr.length) {
            int correct = arr[i];
            // Make sure the value is within the expected range to avoid ArrayIndexOutOfBoundsException
            if (arr[i] < arr.length && arr[i] != arr[correct]) {
                int temp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = temp;
            } else {
                i++;
            }
        }
    }

    static int missing(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != i) {
                return i;
            }
        }
        return arr.length;
    }
}
