package javaBasics;

import java.util.Scanner;

public class SwappingTwoNumbers {

    public static void main(String[] args) {

        System.out.println("enter the first number :- ");
        Scanner input=new Scanner(System.in);

        int a= input.nextInt();

        System.out.println("Enter the second number :-");

        int b =input.nextInt();

        int temp=a;

        a=b;
        b=temp;

        System.out.println(a+" "+b);

        // without using third variable


    }
}
