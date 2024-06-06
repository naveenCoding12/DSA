package Searching.LinearSearch;

public class CharBoolean {

    public static void main(String[] args) {

        String str="naveen";

        char target='k';

        System.out.println(charPrsent(str,target));
    }

    public static  boolean charPrsent(String str,char targeted){

        if(str.isEmpty()){
            return false;
        }

        for(char ch:str.toCharArray()){
            if (ch==targeted){
                return  true;
            }

        }
        return  false;
    }



}
