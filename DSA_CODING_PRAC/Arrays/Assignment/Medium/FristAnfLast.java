package Arrays.Assignment.Medium;

public class FristAnfLast {
    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 8;

        int first = fristBinary(nums, target);
        int second = secondBinary(nums, target);
//        return new int[]{first, second};
    }

    static int fristBinary(int[] nums, int taregt) {
        int left = 0, right = nums.length - 1;
        int result = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid]==taregt){
                result=mid;
                right=mid-1; // first poccurenece
            } else if (nums[mid]>taregt) {
                left=mid+1;
            }
            else {
                right=mid-1;
            }
        }
        return result;
    }

    static int secondBinary(int [] nums,int target){
        int left = 0, right = nums.length - 1;
        int result = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid]==target){
                result=mid;
                left=mid+1; // second poccurenece
            } else if (nums[mid]>target) {
                left=mid+1;
            }
            else {
                right=mid-1;
            }
        }
        return result;
    }
}