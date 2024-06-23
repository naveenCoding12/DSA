package Strings;

public class StringDemo {
    public static void main(String[] args) {
        // string is collection of character
        // string is nothing but char array
        // String is a class
        // string is immutable in nature for security reasons

        String name="naveen";
        // Stings are stored im string pool in heap memory
        String nam="naveen";

        // = operator is used to check the both reference variables are pointing to the same objcet or not

        System.out.println(name==nam);

        // for checking the reference variables pointing to different objects use new

        String per=new String("naveen");
        String peru=new String("naveen");

        System.out.println(per==peru);

        // for comparing the objects we use the .equals method

        System.out.println(per.equals(peru));

        // we use String [] args for command line we use string data type only in it

        System.out.println(args);
    }
}
