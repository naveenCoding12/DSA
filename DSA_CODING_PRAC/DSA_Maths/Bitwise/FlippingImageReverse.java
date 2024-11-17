package DSA_Maths.Bitwise;

import java.util.Arrays;

public class FlippingImageReverse {

    public static void main(String[] args) {
        int[][] arr = {
                {1, 1, 0},
                {1, 0, 1},
                {0, 0, 0}
        };

        int[][] result = flipAndReverse(arr);

        // Print the result array
        for (int[] row : result) {
            System.out.println(Arrays.toString(row));
        }
    }

    static int[][] flipAndReverse(int[][] arr) {
        int columns = arr[0].length;

        for (int[] row : arr) {
            // Reverse the row and flip the bits
            for (int i = 0; i < (columns + 1) / 2; i++) {
                int temp = row[i] ^ 1;
                row[i] = row[columns - i - 1] ^ 1;
                row[columns - i - 1] = temp;
            }
        }
        return arr;
    }
}
