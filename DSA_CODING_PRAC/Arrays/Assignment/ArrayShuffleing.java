package Arrays.Assignment;

import java.util.Arrays;

public class ArrayShuffleing {

    public static void main(String[] args) {

        int [] arr={1,2,3,4,5,6};
        int n=2;
        System.out.println("Array after Shuffled :-"+ Arrays.toString(shuffle(arr,n)));
    }

    public static int []  shuffle(int [] arr,int n){
        int [] result=new int[2*n];
        for (int i = 0; i < n; i++) {
            result[2*i]=arr[i];
            result[2*i+1]=arr[i+n];

        }

        return result;
    }
}
