package Sorting.count;

import java.util.Arrays;

public class CountSort {
    public static void main(String[] args) {
        int [] arr={5,2,5,1,4};

        // find the largest element
        int max=5;
        int [] countArray=new int[max+1];

        for(int num:arr){
            countArray[num]++;
        }
        int index=0;
        for (int i = 0; i <=max ; i++) {
            while (countArray[i]>0){
                arr[index]=i;
                index++;
                countArray[i]--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
