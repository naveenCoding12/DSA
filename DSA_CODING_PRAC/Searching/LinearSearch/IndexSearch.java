package Searching.LinearSearch;

public class IndexSearch {

    public static void main(String[] args) {

        int [] arr={1,2,3,4,5,6};
        int target=5;
        System.out.println(index(arr,target));
    }

    public static int index(int [] arr,int target){

        if(arr.length==0){
            return -1;    // if array is empty is no element
                          // if no element found return -1
        }

        for (int i = 0; i < arr.length ; i++) {
            if(arr[i]==target){
                return  i;
            }

        }
        return -1 ; // if no element found in an array
    }
}
