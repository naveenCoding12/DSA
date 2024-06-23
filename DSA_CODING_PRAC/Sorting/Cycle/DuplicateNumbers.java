package Sorting.Cycle;

import java.util.ArrayList;
import java.util.List;

public class DuplicateNumbers {

    public static void main(String[] args) {
        int [] arr={1,3,4,2,2,4,3};
        sort(arr);
        System.out.println("Duplicate Numbers : -"+" "+duplicate(arr));
    }

    static void sort(int [] arr){
        // numbers range form 1 to n
        int i=0;
        while(i< arr.length){
            // range from 1 to N so index=value-1
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

    static List<Integer> duplicate(int [] arr){
        List<Integer> list=new ArrayList<>();
        // {1,2,3,4,2}
        for (int i = 0; i < arr.length ; i++) {
            if(arr[i]!=i+1 && !list.contains(arr[i])){
                list.add(arr[i]);
            }

        }
        return list;
    }
}
