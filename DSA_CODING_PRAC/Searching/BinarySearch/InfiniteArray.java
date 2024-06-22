package Searching.BinarySearch;

public class InfiniteArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 6, 7, 8};
        int target = 8;
        System.out.println(find(arr, target));
    }

    public static int find(int[] arr, int target) {
        // initial box size
        int start = 0;
        int end = 1;

        // Increase the box size until the end is within the array bounds and the target is greater than arr[end]
        while (end < arr.length && target > arr[end]) {
            // next box size starting point
            int temp = end + 1;
            // double the box size
            end = end + (end - start + 1) * 2;

            // Ensure end does not exceed the array bounds
            if (end >= arr.length) {
                end = arr.length - 1;
            }

            start = temp;
        }

        return binarySearch(arr, target, start, end);
    }

    public static int binarySearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
