package LinkedList.problems;

import java.util.ArrayList;

public class HappyNumber {

    public static void main(String[] args) {
        int start=10;
        int last=100;
        ArrayList<Integer> list=happyNumber(start,last);
        System.out.println(list);
    }
    static ArrayList<Integer> happyNumber(int from, int end){
        ArrayList<Integer> list=new ArrayList<>();
        for (int i = from; i <=end ; i++) {
            // start the slow and fast pointers
            int fast=i;
            int slow=i;
            do {
                slow=squares(slow);
                fast=squares(squares(fast));
            }while (fast!=slow);
            if(slow==1){
                list.add(i);
            }
        }
        return list;
    }

    private static int squares(int num){
        int ans=0;
        while(num>0){
            int digit=num%10;
            ans+=digit*digit;
            num=num/10;
        }
        return ans;
    }
}
