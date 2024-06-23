package Sorting.Cycle;

import java.util.ArrayList;
import java.util.List;

public class MissingAllNumbers {

    public static void main(String[] args) {

        int[] arr = {4,3,2,7,8,2,3,1};
        sort(arr);
        System.out.println("missing numbers "+" "+missing(arr));
    }

    static void sort(int [] arr){

        int i=0;
        while(i< arr.length){
            int correct=arr[i]-1;
            if(arr[i]!=arr[correct]){
                int temp=arr[i];
                arr[i]=arr[correct];
                arr[correct]=temp;
            }
            else{
                i++;
            }
        }
    }
    static List<Integer> missing(int [] arr){

        List<Integer> list=new ArrayList<>();

        for (int i = 0; i < arr.length ; i++) {
            if(arr[i]!=i+1){
                list.add(i+1);
            }
        }
        return list;
    }
}
