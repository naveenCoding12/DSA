package javaBasics.Conditions;

import java.util.Scanner;

public class CountOfNumber {

    public static void main(String[] args) {
        System.out.println("Enter the number to find digit occurrence :- ");

        Scanner input=new Scanner(System.in);

        int number = input.nextInt();;

        System.out.println("Enter the digit to find how many time it repeats :- ");

        int digitToSearch= input.nextInt();

        int count=0;

        while(number>0){
            int digit=number%10;
            if(digitToSearch==digit){
                count++;
            }
            number/=10;
        }
        System.out.println("this  "+" "+digitToSearch+"  "+ " repeated "+count);

    }
}
