package Arrays.Assignment.Medium;

import java.util.Arrays;

public class PositionTracker {
    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(position(5,6,1,4)));
    }

    static  int[][] position(int rows, int cols , int rstart , int cstart){
        int [][] result=new int[rows*cols][2];
        int [][] directions={{0,1},{1,0},{0,-1},{-1,0}};
        int count=0;
        int steps=1;
        int dirIndex=0;
        int r=rstart ,c =cstart;
        while (count<rows*cols){
            for (int i = 0; i <2 ; i++) {
                int[] dir=directions[dirIndex%4];
                for (int j = 0; j <steps ; j++) {
                    if(r>=0 && r<rows && c>=0 && c<cols){
                        result[count++]=new int[]{r,c};
                    }
                    r+=dir[0];
                    c+=dir[1];
                }
                dirIndex++;
            }
            steps++;
        }
        return result;
    }
}
