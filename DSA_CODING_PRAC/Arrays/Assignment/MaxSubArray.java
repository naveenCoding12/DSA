package Arrays.Assignment;

public class MaxSubArray {

    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        int maxCurrent = nums[0];
        int maxGlobal = nums[0];

        for (int i = 1; i < nums.length; i++) {
            maxCurrent = Math.max(nums[i], nums[i] + maxCurrent);
            maxGlobal = Math.max(maxGlobal, maxCurrent);  // Corrected this line
        }

        System.out.println(maxGlobal);  // Output should be 6
    }
}
