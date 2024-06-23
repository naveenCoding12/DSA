package Sorting.Bubblesort;

import java.util.Arrays;

public class Bubble {

    public static void main(String[] args) {

        int [] arr={3,5,4,1,2,6,9,8,4};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static  void sort(int [] arr){

        // run to N-1 times
        // if array is sorted array
        boolean swap;

        for (int i = 0; i < arr.length; i++) {
            swap=false;
            for (int j = 1; j < arr.length-i; j++) {
                if(arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;

                    swap=true;
                }
            }
            if(!swap){
                break;
            }

        }

    }
}
