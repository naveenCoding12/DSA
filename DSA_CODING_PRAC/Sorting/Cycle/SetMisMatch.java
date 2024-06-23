package Sorting.Cycle;

import java.util.ArrayList;
import java.util.List;

public class SetMisMatch {

    public static void main(String[] args) {
        int [] arr={1,2,2,4};
        sort(arr);
        System.out.println("Number repeated and removed number "+setMiss(arr));
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

    static List<Integer> setMiss(int [] arr){

        List<Integer> list=new ArrayList<>();
        for (int i = 0; i < arr.length ; i++) {
            if(arr[i]!=i+1 && !list.contains(arr[i])){
                list.add(i);
                list.add(i+1);
            }

        }
    return list;
    }
}
