package Arrays.Assignment.Medium;

public class JumpGame {
    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 1, 4};
        System.out.println(isReachable(nums));
    }

    static boolean isReachable(int[] nums) {
        int reachable = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i > reachable) {
                return false;
            }
            reachable = Math.max(reachable, i + nums[i]);
            if (reachable >= nums.length - 1) {
                return true;

            }
        }
        return true;
    }
}
