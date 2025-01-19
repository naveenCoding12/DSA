package Recursion.Strings;

import java.util.ArrayList;
import java.util.List;

public class SubSets {

    public static void main(String[] args) {
        // Time and space complexity are O(N * 2^N)
        int [] arr={1,2,3};
        List<List<Integer>> out=set(arr);
        for(List<Integer> list : out){
            System.out.println(list);
        }
    }

    static  List<List<Integer>> set(int[] arr){
        List<List<Integer>> output=new ArrayList<>();
        output.add(new ArrayList<>());

        for(int num:arr){
            int n =output.size();
            for (int i = 0; i <n ; i++) {
                List<Integer> internal=new ArrayList<>(output.get(i));
                internal.add(num);
                output.add(internal);

            }
        }
        return output;
    }
}
