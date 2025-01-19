package Recursion.Strings;

public class SKipString {

    public static void main(String[] args) {
        System.out.println(skipApple("navappleeen"));
        System.out.println(skipAppNotApple("navappeen"));
    }

    static String skipApple(String s){
        if(s.isEmpty()){
            return "";
        }

        if(s.startsWith("apple")){
            return  skipApple(s.substring(5));
        }
        else {
            return s.charAt(0)+skipApple(s.substring(1));
        }
    }

    static String skipAppNotApple(String s){
        if(s.isEmpty()){
            return "";
        }
        if(s.startsWith("app") && !s.startsWith("apple")){
            return skipAppNotApple(s.substring(3));
        }
        else {
            return  s.charAt(0)+skipAppNotApple(s.substring(1));
        }
    }
}
