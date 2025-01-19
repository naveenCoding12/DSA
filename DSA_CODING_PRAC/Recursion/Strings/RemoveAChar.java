package Recursion.Strings;

import java.util.Scanner;

public class RemoveAChar {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the string to remove a character :- ");
        String s= scanner.next();

        StringBuilder output=new StringBuilder();
        StringBuilder output2=new StringBuilder();

        for (int i = 0; i<s.length() ; i++) {
            if(s.charAt(i)!='a'){
                output.append(s.charAt(i));
            }
        }

        for(char c: s.toCharArray()){
            if(c!='a'){
                output2.append(c);
            }
        }
        System.out.println(output);
        System.out.println(output2);
        System.out.println(skip(s));
        skip1("",s);
    }

    static void skip1(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char c=up.charAt(0);

        if(c=='a'){
            skip1(p,up.substring(1));
        }
        else{
            skip1(p+c,up.substring(1));
        }
    }

    static String skip(String s){
        if(s.isEmpty()){
            return "";
        }
        char c=s.charAt(0);
        if(c=='a'){
            return  skip(s.substring(1));
        }
        else {
          return  c+skip(s.substring(1));
        }
    }
}
