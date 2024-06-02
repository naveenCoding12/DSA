package Arrays.Assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TwoSum {

    public static void main(String[] args) {

//        Input: nums = [2,7,11,15], target = 9
//        Output: [0,1]
//        Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

            int [] nums={2,7,11,15};

            int target=9;

            List<Integer> list=new ArrayList<>();
            for (int i = 0; i < nums.length ; i++) {
                for (int j = i+1; j < nums.length ; j++) {
                     if (nums[i]+nums[j]==target){
                         list.add(i);
                         list.add(j);
                }


            }

        }
            int [] output=new int[list.size()];

        for (int i = 0; i < list.size() ; i++) {
            output[i]= list.get(i);

        }
        System.out.println(Arrays.toString(output));
    }
}
