package Arrays.Assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Transpose {

    public static void main(String[] args) {

        int [][] arr={{1,2,3},{4,5,6}};

        int [][] transpos=transposeArray(arr);

        for(int [] ar:transpos){
            System.out.print(Arrays.toString(ar)+" ");
        }
    }

    public static int[][] transposeArray(int[][] arr) {
        int rows = arr.length;
        int cols = arr[0].length;
        int[][] returnArray = new int[cols][rows]; // Swap rows and columns for the transposed matrix

        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                returnArray[i][j] = arr[j][i];
            }
        }
        return returnArray;
    }
}
