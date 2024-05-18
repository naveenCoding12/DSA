package javaBasics;

import java.util.Scanner;

public class SwappingVariablesWithoutThird {

    public static void main(String[] args) {

        System.out.println("Enter the first  number :- ");

        Scanner input=new Scanner(System.in);

        int a=input.nextInt();

        System.out.println("Enter the second number ");
        int b=input.nextInt();

        a=a+b;   // a=10+20
        b=a-b;   // b=30-20
        a=a-b;   // a=30-10


        System.out.println("After swapping "+a+"  "+b);

    }
}
