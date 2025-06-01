package Arrays.Assignment.Medium;

import javax.imageio.ImageTranscoder;
import java.util.Arrays;

public class NumToSparial {
    public static void main(String[] args) {
        int n = 4;

        int[][] arr = new int[n][n];
        int num = 1;

        int top = 0;
        int left = 0;
        int bottom = n - 1;
        int right = n - 1;

        while (top <= bottom && top <= right) {
            for (int i = left; i <= right; i++) {
                arr[top][i] = num++;
            }
            top++;
            for (int i = top; i <= bottom; i++) {
                arr[i][right] = num++;
            }
            right--;
            if (top <= bottom) {
                for (int i = right; i >=left; i--) {
                    arr[bottom][i] = num++;
                }
                bottom--;
            }
            if(left<=right){
                for (int i = bottom; i >=top ; i--) {
                    arr[i][left]=num++;
                }
                left++;
            }
        }
//        return arr;
        System.out.println(Arrays.deepToString(arr));
    }

}
