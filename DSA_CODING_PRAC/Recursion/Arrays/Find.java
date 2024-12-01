package Recursion.Arrays;

import java.util.ArrayList;

public class Find {

    public static void main(String[] args) {

        int [] arr={1,2,3,3,4,5};
        System.out.println(find(arr,3,0));
        System.out.println(findIndex(arr,3,0));
        System.out.println(findIndexBack(arr,3,arr.length-1));
        findAll(arr,3,0);
        System.out.println(list);
    }

    static boolean find(int [] arr, int target, int index){
        if(index== arr.length){
            return  false;
        }
        return arr[index]==target || find(arr,target,index+1);
    }

    static  int findIndex(int [] arr , int target, int index){
        if(index== arr.length){
            return -1;
        }
        if(arr[index]==target){
            return index;
        }
        else{
            return  findIndex(arr, target,index+1);
        }
    }
    static int findIndexBack(int [] arr, int target,int index){
        if(index==-1){
            return -1;
        }
        if(arr[index]==target){
            return index;
        }
        else {
            return findIndexBack(arr,target,index-1);
        }
    }

    static ArrayList<Integer> list =new ArrayList<>();
    static void findAll(int [] arr, int target, int index){
        if(index== arr.length){
            return;
        }
        if(index==target){
            list.add(index);
        }
        findAll(arr,target,index+1);
    }
}
