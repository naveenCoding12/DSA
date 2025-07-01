package Sorting;

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int [] arr={5,3,2,1,4,0};

        int i=0;
        while (i< arr.length){
            int correct =arr[i];
            if(arr[i]!=arr[correct]){
                int temp=arr[i];
                arr[i]=arr[correct];
                arr[correct]=temp;
            }
            i++;
        }
        System.out.println(Arrays.toString(arr));
    }
}
