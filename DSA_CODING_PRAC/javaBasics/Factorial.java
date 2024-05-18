package javaBasics;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        System.out.print("Enter the number upto to the factoroial :- ");

        Scanner input=new Scanner(System.in);

        int number=input.nextInt();

        System.out.println("factorial of a number "+fact(number));
    }

    public static int fact(int n){
        int result=0;
        if (n<=1){
             result= 1;
        }
        else{
             result=n*fact(n-1);
        }
        return result;
    }
}
