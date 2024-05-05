package javaBasics;

import java.util.Scanner;

public class Prime {

    public static void main(String [] args){

        System.out.println("Enter the number to check prime or not ");

        Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();
        int c=2;
        boolean isPrime=true;

        while (c<=Math.sqrt(num)){
            if (num % c==0){
                isPrime=false;
                break;
            }
            c++;
        }
        if (isPrime){
            System.out.println("given number "+num+"is a prime number ");
        }
        else {
            System.out.println("given number "+num + "is not a prime number");
        }
    }
}
