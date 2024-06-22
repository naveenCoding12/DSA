package Searching.BinarySearch;

public class RotationBinarySearch {

    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        int target = 6;
        System.out.println(search(arr, target));  // Should return the index of target
    }

    public static int search(int[] arr, int target) {
        int pivot = findPivot(arr);

        // If no pivot is found, the array is not rotated
        if (pivot == -1) {
            return binarySearch(arr, target, 0, arr.length - 1);
        }

        // If the target is at the pivot
        if (arr[pivot] == target) {
            return pivot;
        }

        // If target is greater than or equal to the first element, search in the left half
        if (target >= arr[0]) {
            return binarySearch(arr, target, 0, pivot - 1);
        }

        // Otherwise, search in the right half
        return binarySearch(arr, target, pivot + 1, arr.length - 1);
    }

    public static int binarySearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == arr[mid]) {
                return mid;
            }
            if (target < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    public static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            // Check if mid is the pivot
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }

            // Decide which half to continue with
            if (arr[mid] >= arr[start]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;  // Pivot not found, array is not rotated
    }
}
