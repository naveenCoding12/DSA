package Arrays.Assignment;

import java.util.Arrays;

public class ArrayConact {

    public static void main(String[] args) {

        int [] arr1={1,2,3};
        int [] arr2={4,5,6};

        int [] concatArray=concatArrays(arr1,arr2);
        System.out.println("Confiscated Array :"+ Arrays.toString(concatArray));
    }

    public static int[] concatArrays(int [] arr1,int[] arr2){

        int length1=arr1.length;
        int length2=arr2.length;

        int [] result=new int[length1+length2];

        System.arraycopy(arr1,0,result,0,length1);
        System.arraycopy(arr2,0,result,length1,length2);

        return  result;




    }
}
