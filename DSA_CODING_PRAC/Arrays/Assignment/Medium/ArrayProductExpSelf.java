package Arrays.Assignment.Medium;

public class ArrayProductExpSelf {
    public static void main(String[] args) {
        int [] nums={1,2,3,4};

        int n= nums.length;
        int [] answer=new int[n];
        //prefix sum
        int prefix=1;
        for (int i = 0; i <n ; i++) {
            answer[i]=prefix;
            prefix*=nums[i];
        }

        int suffix=1;
        for (int i = 0; i < n; i++) {
            answer[i]*=suffix;
            suffix*=nums[i];
        }

//        return;answer;

    }
}
