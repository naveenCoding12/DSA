package Searching.BinarySearch;

public class MountainSearch {

    public static void main(String[] args) {

        int [] arr={2,3,4,5,6,7,4,3,1,0};
        int target=1;
        // find the peak element
        int peak=peak(arr);
        int fristTry=binarySearch(arr,target,0,peak);

        if(fristTry!=-1){
            System.out.println(fristTry);
        }
        else{
            System.out.println(binarySearch(arr,target,peak+1,arr.length-1));
        }
    }

    public static int peak(int [] arr){
        int start=0;
        int end= arr.length-1;

        while(start<end){
            int mid=start+(end-start)/2;
            if(arr[mid]>arr[mid+1]){
                // desc order
                end=mid;
            }
            else{
                // ascending
                start=mid+1;
            }
        }
        return start;
    }
    public static int binarySearch(int [] arr, int target, int start, int end){
        boolean isAsec=arr[start]<arr[end];

        while(start<=end){
            int mid=start+(end-start)/2;
            if(target==arr[mid]){
                return mid;
            }
            if(isAsec){
                if(target<arr[mid]){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
            else {
                if(target>arr[mid]){
                    end=mid-1;
                }
                else {
                    start=mid+1;
                }
            }
        }
        return -1;
    }
}
