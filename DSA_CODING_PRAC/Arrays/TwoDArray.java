package Arrays;

import java.util.Scanner;

public class TwoDArray {

    public static void main(String[] args) {

        // 2D Array direct initialization
        int[][] naveen = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 0}};

        // 2D array declaration
        int[][] arr;

        // Initialize an array with the number of rows (fixed)
        arr = new int[2][2];

        // Initialize each row with a fixed number of columns
        // Here we assume 5 columns for each row as an example, but this can vary
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = new int[5]; // initializing each row with 5 columns
//        }

        // Taking input from user
        Scanner in = new Scanner(System.in);
        System.out.println("Enter elements for a 5x5 array:");

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = in.nextInt();
            }
        }

        // Printing the array in matrix form
        System.out.println("The 2D array is:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
