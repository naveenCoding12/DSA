package Searching.BinarySearch;

public class SmallestLetter {

    public static void main(String[] args) {

        char  [] charArr={'c','d','e','f'};
        char target='c';
        System.out.println("smallest char grater than the target"+ "    "+letter(charArr,target));
    }

    public static char letter(char [] arr,char ch){

        int start=0;
        int end= arr.length-1;

        while(start<=end){
            int mid=start+(end-start)/2;
            if(ch<arr[mid]){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return arr[start % arr.length];
    }
}
