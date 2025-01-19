package Recursion.Strings;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class SubSeq {

    public static void main(String[] args) {
        seq("","abc");
        System.out.println((serRet("","abc")));
    }

    static void seq(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);
        seq(p+ch,up.substring(1));
        seq(p,up.substring(1));
    }

    static ArrayList<String> serRet(String p,String up){
        if(up.isEmpty()){
            ArrayList<String> arrayList=new ArrayList<>();
            arrayList.add(p);
            return arrayList;
        }
        char ch =up.charAt(0);
        ArrayList<String> left=serRet(p+ch,up.substring(1));
        ArrayList<String> right=serRet(p,up.substring(1));

        left.addAll(right);
        return left;
    }
}
