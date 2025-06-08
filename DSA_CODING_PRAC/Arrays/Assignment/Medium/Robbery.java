package Arrays.Assignment.Medium;

public class Robbery {
    public static void main(String[] args) {
        int [] nums={1,2,3,1};
        int prev1=Math.max(nums[0],nums[1]);
        int prev2=nums[0];

        for (int i = 2; i < nums.length ; i++) {
            int current=Math.max(prev1,prev2+nums[i]);
            prev2=prev1;
            prev1=current;
        }
//        return prev1;
        System.out.println(prev1);
    }
}
