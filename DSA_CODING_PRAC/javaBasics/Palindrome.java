package javaBasics;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {

        System.out.print("Enter th number to check number is palindrome or not :- ");

        Scanner input=new Scanner(System.in);

        int number=input.nextInt();

        if(isPalindrome(number)){
            System.out.println(number+" is a palindrome ");
        }
        else{
            System.out.println(number+" is not a palindrome number ");
        }
    }
    public static boolean isPalindrome(int number){
        int originalNumber=number;
        int reverseNumber=0;
        while(number!=0){
            int digit=number%10;
            reverseNumber=reverseNumber*10+digit;
            number/=10;
        }
        return originalNumber==reverseNumber;
    }
}
