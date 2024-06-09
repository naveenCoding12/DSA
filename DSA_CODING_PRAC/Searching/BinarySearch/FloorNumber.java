package Searching.BinarySearch;

public class FloorNumber {

    public static void main(String[] args) {

        int [] arr={1,2,3,5,9,14,16,18};
        int target=13;
        int i=floor(arr,target);
        if (i == -1) {
            System.out.println("No floor found for " + target);
        } else {
            System.out.println("Floor of the number: " + arr[i]);
        }
    }

    public static int floor(int [] arr,int target){

        int start=0;
        int end= arr.length-1;

        boolean isAec=arr[start]<arr[end];

        // Handling the case where target is smaller than the smallest element in the array
        if (target < arr[start]) {
            return -1; // No floor value exists
        }

        while(start<=end){
            int mid=start+(end-start)/2;

            if(isAec){
                if(target<=arr[mid]){
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
        return end;
    }
}
