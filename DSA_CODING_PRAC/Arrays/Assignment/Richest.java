package Arrays.Assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Richest {

    public static void main(String[] args) {

        int [][] arr={{1,2,3},{4,5,6}};

        int max=calcRichest(arr);

        System.out.println(max);
    }

    public static int calcRichest(int [][] arr){

        List<Integer> list=new ArrayList<>();

        for(int [] array:arr){
            int sum=0;
            for (int i = 0; i < array.length ; i++) {
                sum=sum+array[i];
            }
            list.add(sum);
        }

        int max=Integer.MIN_VALUE;
        for (int i = 0; i < list.size() ; i++) {
            if(list.get(i)>max){
                max= list.get(i);
            }
        }
        return max;
    }

}
