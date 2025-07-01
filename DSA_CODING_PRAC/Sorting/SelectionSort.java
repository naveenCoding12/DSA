package Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr={5,3,2,1,4};

        for (int i = 0; i < arr.length ; i++) {
            // find the last index
            int last= arr.length-i-1;
            int maxIndex=max(arr,last+1);
            swap(arr,last,maxIndex);
        }
        System.out.println(Arrays.toString(arr));
    }

    static int max(int [] arr, int end){
        int max=0;
        for (int i = 0; i <end ; i++) {
            if(arr[i]>arr[max]){
                max=i;
            }
        }
        return max;
    }

    static  void swap(int[] arr, int last,int maxIndex){
        int temp=arr[last];
        arr[last]=arr[maxIndex];
        arr[maxIndex]=temp;
    }
}
