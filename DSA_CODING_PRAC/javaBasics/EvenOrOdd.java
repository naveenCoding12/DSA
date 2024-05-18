package javaBasics;

import java.util.Scanner;

public class EvenOrOdd {

    public static void main(String[] args) {
        System.out.print("Enter the number to check whether it is prime or not :");
        Scanner input=new Scanner(System.in);
        int number=input.nextInt();

        if(number%2==0){
            System.out.println(number+" "+"is even number");
        }else{
            System.out.println(number+" "+"is odd number");
        }
    }
}
