package Searching.LinearSearch;

public class MaxIn2D {

    public static void main(String[] args) {

        int [][] arr={{1,2,3},{89,100},{22000}};

        int max=maximum(arr);
        System.out.println(max);
    }

    public static int maximum(int [][] arr){
        int max=Integer.MIN_VALUE;

        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                if(arr[i][j]>max){
                    max=arr[i][j];
                }
            }

        }
        return  max;
    }
}
