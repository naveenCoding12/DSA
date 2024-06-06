package Searching.LinearSearch;

public class ElementExists {

    public static void main(String[] args) {

        int [] arr={1,2,3,4,5,6};
        int element=29;
        System.out.println(elementPrsent(arr,element));
    }

    public static boolean elementPrsent(int [] arr, int target){

        if(arr.length==0){
            return  false;
        }

        for(int ele:arr){
            if(ele==target){
                return true;
            }
        }

        return false;
    }
}
