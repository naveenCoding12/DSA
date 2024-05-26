package javaBasics.Conditions;

import java.util.Scanner;

public class LargestNumber {

    public static void main(String[] args) {

        System.out.println("Enter the three numbers ");
        Scanner input=new Scanner(System.in);

        int a =input.nextInt();

        int b=input.nextInt();

        int c=input.nextInt();

        int max=a;

        if(b>max){
            max=b;
        }

        if(c>max){
            max=c;
        }

        System.out.println(max);
    }
}
