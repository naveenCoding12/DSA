package Searching.LinearSearch;

public class StringCharSearchIndex {

    public static void main(String[] args) {

        String str="naveen"; // string is a collection of char array
        char target='n';
        System.out.println("index at "+searchChar(str,target));
    }

    public static int searchChar(String str,char target){

        if(str.length()==0){
            return -1; // length used for variables length() is a function internal class to length only
        }

        char [] ch=str.toCharArray();

        for (int i = 0; i <ch.length ; i++) {
            if(ch[i]==target){
                return i;
            }

        }
        return -2;


    }
}
