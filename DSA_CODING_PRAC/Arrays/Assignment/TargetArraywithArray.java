package Arrays.Assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TargetArraywithArray {
    public static void main(String[] args) {

        int [] arr={0,1,2,3,4};
        int [] index={0,1,2,2,1};

        int [] output=targetArray(arr,index);
        System.out.println(Arrays.toString(output));
    }
    public static  int [] targetArray(int [] arr, int [] index){
        List<Integer> targetList=new ArrayList<>();

        for (int i = 0; i < arr.length ; i++) {
            targetList.add(index[i],arr[i]);
        }
        int [] output=new int[targetList.size()];

        for (int i = 0; i <targetList.size() ; i++) {
            output[i]=targetList.get(i);

        }
        return  output;
    }
}
