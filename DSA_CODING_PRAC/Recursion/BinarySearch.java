package Recursion;

public class BinarySearch {

  public static void main(String[] args) {

    int [] arr={1,2,3,4,5,6,7};
    int target=6;
    System.out.println(search(arr,target,0, arr.length)-1);
  }

  static int search(int [] arr, int target, int s, int end){
    // if the variables are passing for the future recursions pass to the arguments
    if(s>end){
      return -1;
    }
    // if the variables are not passing to the future pass to the body of the function

    int mid=s+(end-s)/2;

    if(target==arr[mid]){
      return mid;
    }

    if(target<arr[mid]){
      return search(arr,target,s,mid-1);
    }
    return search(arr,target,mid+1,end);
  }
}
