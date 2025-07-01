package Sorting;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int [] arr={5,3,4,2,1};
        quick(arr,0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    static void quick(int[] arr,int low,int high){
        if(low>=high){
            return;
        }
        int s=low;
        int e=high;
        int m=s+(e-s)/2;
        int pivot=arr[m];

        while (s<=e){
            while (arr[s]<pivot){
                s++;
            }
            while (arr[e]>pivot){
                e--;
            }
            if (s<=e){
                int temp=arr[e];
                arr[e]=arr[s];
                arr[s]=temp;
                s++;
                e--;
            }
        }
        quick(arr,low,e);
        quick(arr,s,high);

    }
}
