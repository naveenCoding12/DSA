package Strings;

public class StringAdd {
    public static void main(String[] args) {

        String s="";

        for (int i = 0; i <26 ; i++) {
            //generating the a to z using the char 'a' + 1 (char) type casting
            char ch=(char)('a'+i);
            s+=ch;
        }
        //  generating this we get O(N^2)
        System.out.println(s);
    }
}
