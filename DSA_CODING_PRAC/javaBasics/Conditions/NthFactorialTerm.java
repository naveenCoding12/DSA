package javaBasics.Conditions;

import java.util.Arrays;
import java.util.Scanner;

public class NthFactorialTerm {

    public static void main(String[] args) {
        System.out.print("Enter the tern what you want :- ");
        Scanner sc=new Scanner(System.in);
         int number= sc.nextInt();

         int a=0;
         int b=1;

         int count=2;

         while(count<=number){

             int temp=b;
             b=b+a;
             a=temp;
             count++;
         }
        System.out.println(b);
    }
}
