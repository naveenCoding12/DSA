package Searching.LinearSearch;

public class MinIn2D {

    public static void main(String[] args) {

        int [][] arr={{1,2,3},{89,100},{22000}};

        int min=minimum(arr);

        System.out.println(min);
    }

    public  static int minimum(int [][] arr){
        int min=Integer.MAX_VALUE;

        for(int[] outer:arr){
            for(int inner:outer){
                if(inner<min){
                    min=inner;
                }
            }
        }
        return  min;
    }
}
