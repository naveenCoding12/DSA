package Arrays;

public class MaxMin {

    public static void main(String[] args) {

        int [] arr={1,2,3,4,5};
        System.out.println("largest element in an array "+max(arr));
        System.out.println("smallest element in an array "+min(arr));
    }
    static  int  max(int [] arr){

        int max=Integer.MIN_VALUE;

        for (int i = 0; i < arr.length ; i++) {
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }

    static int min(int [] arr){
        int min=Integer.MAX_VALUE;

        for (int i = 0; i < arr.length ; i++) {
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return  min;
    }
}
