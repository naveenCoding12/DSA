package Searching.BinarySearch;

public class OderAgosticSearch {

    public static void main(String[] args) {

        int [] arr={1,2,3,4,5,6,7,8,9};
        int [] arr1={9,8,7,6,5,4,3,2,1};
        int target=7;
        System.out.println(indexAt(arr1,target));
    }

    public static int indexAt(int [] arr,int target){

        int start=0;
        int end= arr.length-1;
        boolean isAec=arr[start]<arr[end];

        while(start<=end){

            int mid=start+(end-start)/2;

            if(target==arr[mid]){
                return mid;
            }

            if(isAec){

                if(target<arr[mid]){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
            else{
                if(target>arr[mid]){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }

        }
        return -1;

    }
}
