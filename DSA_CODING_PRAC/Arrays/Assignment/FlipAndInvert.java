package Arrays.Assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FlipAndInvert {

    public static void main(String[] args) {

        int [][] arr={{1,1,0},{1,0,1},{0,0,0}};

        int [][] flipArray=flipArray(arr);
        int [][] invertArray=invertArray(flipArray);
        for(int [] outarr:invertArray){
            System.out.print(Arrays.toString(outarr)+" ");
        }
    }

    public static  int [][] flipArray(int [][] arr){

        List<List<Integer>> list =new ArrayList<>();

        for(int [] array:arr){
            List<Integer> list1=new ArrayList<>();
            for (int i = 0; i <array.length ; i++) {
               list1.add(array[array.length-1-i]);
            }
            list.add(list1);
        }

        int [][] retArray=new int[arr.length][arr.length];

        for (int i = 0; i <list.size() ; i++) {
            List<Integer> dammyList=list.get(i);
            for (int j = 0; j <dammyList.size() ; j++) {
                retArray[i][j]=dammyList.get(j);
            }

        }

        return  retArray;
    }

    public static  int [][] invertArray(int [][] arr){
        List<List<Integer>> invert=new ArrayList<>();

        for(int [] innerarray:arr){
            List<Integer> add=new ArrayList<>();
            for (int i = 0; i <innerarray.length ; i++) {
                if (innerarray[i] == 1) {
                    add.add(innerarray[i]=0);
                }
                else{
                    add.add(innerarray[i]=1);
                }
            }
            invert.add(add);
        }
        int [][] retArray=new int[arr.length][arr.length];

        for (int i = 0; i <invert.size() ; i++) {
            List<Integer> dammyList=invert.get(i);
            for (int j = 0; j <dammyList.size() ; j++) {
                retArray[i][j]=dammyList.get(j);
            }

        }

        return  retArray;
    }
}
