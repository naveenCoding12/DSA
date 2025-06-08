package Arrays.Assignment.Medium;

public class SortColors {
    public static void main(String[] args) {
        int[] nums = {2, 0, 2, 1, 1, 0};

        int low = 0; // assume lower color
        int mid = 0; // current element
        int high = nums.length - 1;
        while (mid <= high) {
            switch (nums[mid]) {
                case 0: {
                    int temp0 = nums[low];
                    nums[low] = nums[mid];
                    nums[mid] = temp0;
                    low++;
                    mid++;
                    break;
                }
                case 1: {
                    mid++;
                    break;
                }
                case 2: {
                    int temp2 = nums[high];
                    nums[high] = nums[mid];
                    nums[mid] = temp2;
                    high--;
                    break;
                }
            }
        }
    }
}
