package Arrays.Assignment;

import java.util.ArrayList;
import java.util.List;

public class Permutation {

    public static void main(String[] args) {

        int [] nums={1,2,3,4};

        // preparations based on pairs

        int r=2;

        List<List<Integer>> result=prem(nums,r);

        for (List<Integer> prems:result){
            System.out.print(prems+" ");
        }
    }

    static List<List<Integer>> prem(int [] nums,int r){

        List<List<Integer>> result=new ArrayList<>();
        backtarck(result,new ArrayList<>(),nums,r);

        return  result;
    }

    static  void  backtarck(List<List<Integer>> result,List<Integer> templist,int [] nums,int r){

        if(templist.size()==r){
            result.add(new ArrayList<>(templist));
        }
        else {
            for (int i = 0; i < nums.length; i++) {
                if(templist.contains(nums[i])){
                    continue;
                }
                templist.add(nums[i]);
                backtarck(result,templist,nums,r);
                templist.remove(templist.size()-1);
                
            }
        }
    }
}
