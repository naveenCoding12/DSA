package Sorting;

import java.util.Arrays;

public class MergeSortInPlace {
    public static void main(String[] args) {
        int [] arr={5,3,1,4,2};
        mergeInPlace(arr,0,arr.length);
        System.out.println(Arrays.toString(arr));
    }
    static void mergeInPlace(int [] arr, int s,int e){
        if(e-s==1){
            return;
        }
        int mid=s+(e-s)/2;
        mergeInPlace(arr, s, mid);
        mergeInPlace(arr, mid, e);
        merge(arr,s,e,mid);
    }

    static  void merge(int [] arr,int s , int e, int m){
        int [] mix=new int[e-s];
        int i=s,j=m,k=0;
        while (i<m && j<e){
            if(arr[i]<arr[j]){
                mix[k]=arr[i];
                i++;
            }
            else {
                mix[k]=arr[j];
                j++;
            }
            k++;
        }
        while (i<m){
            mix[k]=arr[i];
            i++;
            k++;
        }
        while (j<e){
            mix[k]=arr[j];
            j++;
            k++;
        }
        System.arraycopy(mix,0,arr,s,mix.length);
    }
}
