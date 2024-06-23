package Strings;

public class Palindrome {

    public static void main(String[] args) {

        String s="abcdba";
        System.out.println(isPalindrome(s));
    }

    static boolean isPalindrome(String s){
        if(s==null || s.isEmpty()){
            return true;
        }
        for (int i = 0; i <s.length() ; i++) {
            char start=s.charAt(i);
            char end=s.charAt(s.length()-1-i);
            if(start!=end){
                return false;
            }
        }
        return true;
    }
}
