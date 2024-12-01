package Recursion.Arrays;

import java.util.ArrayList;

public class PassingArrayList {

    public static void main(String[] args) {
        int [] arr={1,2,3,4,3,5};
        System.out.println(findAll(arr,3,0,new ArrayList<>()));
        System.out.println(findAll2(arr,3,0));
    }
    static  ArrayList<Integer> findAll(int [] arr, int target, int index, ArrayList<Integer> list){
        if(index== arr.length){
            return list;
        }
        if(arr[index]==target){
            list.add(index);
        }
       return findAll(arr,target,index+1,list);
    }

    static ArrayList<Integer> findAll2(int [] arr, int target,int index){
        ArrayList<Integer> list=new ArrayList<>();

        if(index== arr.length){
            return list;
        }
        if(arr[index]==target){
            list.add(index);
        }

        ArrayList<Integer> returnFromBelowCalls=findAll2(arr,target,index+1);
        list.addAll(returnFromBelowCalls);
        return list;
    }
}
