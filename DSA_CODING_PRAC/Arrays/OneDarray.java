package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class OneDarray {

    public static void main(String[] args) {

        // direct array

        int [] naveen={1,2,3,4,5};

        System.out.println(Arrays.toString(naveen));

        // array declaration

        int [] arr;

        // infantile

        arr=new int[5];

        System.out.println("an empty array "+Arrays.toString(arr));

        // taking input form the user

        Scanner scanner=new Scanner(System.in);

        for (int i = 0; i <arr.length ; i++) {
            arr[i]=scanner.nextInt();

        }

        // printing an array

        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        // to string method to print in an array form

        System.out.println(Arrays.toString(arr));


    }
}
