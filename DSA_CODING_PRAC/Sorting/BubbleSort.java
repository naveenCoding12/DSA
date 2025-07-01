package Sorting;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int [] arr={5,3,1,2,4};
        boolean isSwapped=false;

        for (int i = 0; i < arr.length ; i++) {
            for (int j = 1; j < arr.length-i ; j++) {
                if(arr[j]<arr[j-1]){
                    int temp=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                    isSwapped=true;
                }
            }
            if(!isSwapped){
                break;
            }
        }

        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr.length-i-1 ; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
