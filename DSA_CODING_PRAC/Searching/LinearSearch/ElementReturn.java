package Searching.LinearSearch;

public class ElementReturn {

    public static void main(String[] args) {

        int [] arr={1,2,3,4,5,6};

        int index=5;

        System.out.println(index+" "+" index first match  at "+element(arr,index)+" "+"element in an array");
    }

    public static  int element(int [] arr, int target){

        if(arr.length==0){
            return -1;
        }

        for (int i = 0; i < arr.length ; i++) {
            if(arr[i]==arr[target]){
                return arr[i];
            }
        }

        return -1;
    }
}
