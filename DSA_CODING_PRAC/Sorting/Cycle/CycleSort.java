package Sorting.Cycle;

import java.util.Arrays;

public class CycleSort {

    public static void main(String[] args) {

        int [] arr={5,3,4,2,1};
        sort(arr);
        System.out.println(Arrays.toString(arr));
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
}
