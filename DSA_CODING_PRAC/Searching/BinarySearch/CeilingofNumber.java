package Searching.BinarySearch;

public class CeilingofNumber {

    public static void main(String[] args) {
        int [] arr={1,2,3,5,9,14,16,18};
        int target=19;
        int i=celieng(arr,target);
        if (i == -1) {
            System.out.println("No ceiling found for " + target);
        } else {
            System.out.println("ceiling of a number   :- " + arr[i]);
        }
    }

    public static int celieng(int [] arr,int target){

        int start=0;
        int end=arr.length-1;
        boolean isAec=arr[0]<arr[end];

        if(target>arr[arr.length-1]){
            return -1;
        }

        while(start<=end){
            int mid=start+(end-start)/2;

            if(arr[mid] == target){
                return mid;
            }

            if(isAec){
                if(target>arr[mid]){
                    start=mid+1;
                }
                else{
                    end=mid-1;
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
        return start;
    }
}
