package Arrays.Assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayFromInteger {

    public static void main(String[] args) {

        int [] arr={1,2,0,0};

        int k=34;
        List<Integer> list=new ArrayList<>();

        String string="";
        for (int i = 0; i < arr.length ; i++) {
            string = string + String.valueOf(arr[i]);
        }

        int overallSum=Integer.valueOf(string)+k;

        while(overallSum>0){
            list.add(overallSum%10);
            overallSum=overallSum/10;
        }
        int [] result=new int[list.size()];

        for (int i = 0; i < list.size() ; i++) {
            result[i]= list.get(list.size()-1-i);
        }

        System.out.println(Arrays.toString(result));
    }
}
