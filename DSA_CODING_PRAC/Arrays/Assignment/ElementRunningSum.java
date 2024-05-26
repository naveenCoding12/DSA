package Arrays.Assignment;

import java.util.Arrays;

public class ElementRunningSum {

    public static void main(String[] args) {

        int [] arr={1,2,3,4};

        int [] runningSum=calucateRunningSum(arr);

        System.out.println("Arrays elements running sum : "+ Arrays.toString(runningSum));
    }

    public static int [] calucateRunningSum(int [] arr){
        int [] result=new int[arr.length];
        result[0]=arr[0];

        for (int i = 1; i < arr.length ; i++) {
            result[i]=result[i-1]+arr[i];
        }
        return  result;
    }
}
