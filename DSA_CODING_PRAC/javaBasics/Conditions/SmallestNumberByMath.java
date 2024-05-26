package javaBasics.Conditions;

import java.util.Scanner;

public class SmallestNumberByMath {

    public static void main(String[] args) {
        System.out.println("Enter the numbers to check the smaller number :- ");

        Scanner input=new Scanner(System.in);

        int a =input.nextInt();

        int b=input.nextInt();

        int c=input.nextInt();

        int min=Math.min(c,Math.min(a,b));

        System.out.println(min);
    }
}
