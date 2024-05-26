package Arrays.Assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class kidsWithCandies{

    public static void main(String[] args) {

//        Input: candies = [2,3,5,1,3], extraCandies = 3
//        Output: [true,true,true,false,true]
//        Explanation: If you give all extraCandies to:
//        - Kid 1, they will have 2 + 3 = 5 candies, which is the greatest among the kids.
//        - Kid 2, they will have 3 + 3 = 6 candies, which is the greatest among the kids.
//        - Kid 3, they will have 5 + 3 = 8 candies, which is the greatest among the kids.
//        - Kid 4, they will have 1 + 3 = 4 candies, which is not the greatest among the kids.
//                - Kid 5, they will have 3 + 3 = 6 candies, which is the greatest among the kids.

        int [] arr={2,3,5,1,3};
        int extraCandies=3;

        List<Boolean>  output=checkCandies(arr,extraCandies);
        System.out.println(output);
    }

    public static List<Boolean> checkCandies(int [] arr, int extra){
        List<Boolean> output=new ArrayList<>();
        int max=maxiumum(arr);
        for (int i = 0; i < arr.length ; i++) {
            if((arr[i]+3)>=max){
                output.add(true);
            }
            else{
                output.add(false);
            }

        }
        return output;
    }

    private static int maxiumum(int [] arr){

        int max=Integer.MIN_VALUE;

        for (int i = 0; i < arr.length ; i++) {
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return  max;
    }
}

