package Searching.BinarySearch;

public class MountainArray {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 4, 3, 2, 1};
        int i= findPeakElement(arr);
        System.out.println("Peak element index in the array is: " +arr[i]);
    }

    public static int findPeakElement(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start <end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] > arr[mid + 1]) {
                // We are in the decreasing part of the mountain array
                // This means the peak is to the left, including mid
                end = mid;
            } else {
                // We are in the increasing part of the mountain array
                // This means the peak is to the right, excluding mid
                start = mid + 1;
            }
        }
        // At the end of the while loop, start == end and pointing to the peak element
        return start;
    }
}
