package Sorting;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Sortings {
    public static void main(String[] args) {
        int[] arr={5,3,1,4,2};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("selection sort");
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("insertion sort");
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("cyclic sort");
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("merge sort");
        mergeSort(arr,0, arr.length);
        System.out.println(Arrays.toString(arr));
        System.out.println("Quick sort");
        quick(arr,0, arr.length-1);
        System.out.println(Arrays.toString(arr));

    }

    static void bubbleSort(int [] arr){
        // in place and stable
        // best case=O(n)
        //worst case=O(n^2)
        boolean isSwapped=false;
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 1; j <arr.length-i; j++) {
                if(arr[j]<arr[j-1]){
                    int temp=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                    isSwapped=true;
                }
            }
            if(!isSwapped){
                break;
            }
        }
    }

    static  void selectionSort(int [] arr){
        // in place and not stable
        // best and worst cases are O(n^2)

        for (int i = 0; i < arr.length ; i++) {
            int last= arr.length-i-1;
            int max=max(arr,last+1);
            swap(arr,last,max);
        }
    }
    static int max(int[] arr, int end){
        int max=0;
        for (int i = 0; i <end ; i++) {
            if(arr[i]>arr[max]){
                max=i;
            }
        }
        return max;
    }

    static  void swap(int [] arr , int last , int max){
        int temp=arr[max];
        arr[max]=arr[last];
        arr[last]=temp;
    }

    static void insertionSort(int[] arr){
        // stable and in place
        // best case O(n) and worst case O(n^2)
        for (int i = 0; i < arr.length-1 ; i++) {
            for (int j = i+1; j >0 ; j--) {
                if(arr[j]<arr[j-1]){
                    int temp=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                }
                else {
                    break;
                }
            }
        }
    }

    static void cyclicSort(int [] arr){
        // used for range of numbers like 1 to n and 0 to n-1
        // best case O(n) and worst case O(n)
        int i=0;
        while (i< arr.length){
            int correct=arr[i]-1;
            if(arr[i]!=arr[correct]){
                int temp=arr[i];
                arr[i]=arr[correct];
                arr[correct]=temp;
            }
            else {
                i++;
            }
        }
    }

    static void mergeSort(int [] arr, int s, int e){
        // best case O(NLOGN) and space complexity O(n)
        if(e-s==1){
            return ;
        }
        int m=s+(e-s)/2;
        mergeSort(arr,s,m);
        mergeSort(arr,m,e);
        merge(arr,s,e,m);
    }

    static  void merge(int[] arr, int s,int e,int m){
        int [] mix=new int[e-s];
        int i=s,j=m,k=0;
        while (i<m && j<e) {
                if (arr[i] < arr[j]) {
                    mix[k] = arr[i];
                    i++;
                } else {
                    mix[k] = arr[j];
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

    static void quick(int [] arr , int low , int high){
        //quick is finding the pivot
        // BEST case =O(NlogN) and worst case O(n^2) and space O(logn)
        if(low>=high){
            return;
        }
        int s=low;
        int e=high;
        int m=s+(e-s)/2;
        int pivot=arr[m];
        while (s<=e){
            while (arr[s]<pivot){
                s++;
            }
            while (arr[e]>pivot){
                e--;
            }
            if(s<=e){
                int temp=arr[s];
                arr[s]=arr[e];
                arr[e]=temp;
                s++;
                e--;
            }
        }
        quick(arr,low,e);
        quick(arr,s,high);
    }
}
