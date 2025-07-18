package Arrays.Assignment.Medium;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int [] nums={1,2,3,4,5,6,7};
        int k=3;

        int n= nums.length;
        k%=n;

        // reverse entire array
        reverse(nums,0,n-1);
        // reverse first k elements
        reverse(nums,0,k-1);
        //reverse the rest of the array
        reverse(nums,k,n-1);
        System.out.println(Arrays.toString(nums));
    }

    static void reverse(int [] nums,int start, int end){
        while (start<=end){
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
    }
}
