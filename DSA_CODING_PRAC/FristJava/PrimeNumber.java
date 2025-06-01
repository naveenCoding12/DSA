package FristJava;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println("Enter the number to check prime number or not ");
        Scanner scanner=new Scanner(System.in);
        int num= scanner.nextInt();
        int c=2;
        boolean isPrime=true;
        while (c<=Math.sqrt(num)){
            if (num%c==0){
                isPrime=false;
                break;
            }
           c++;
        }
        if(isPrime){
            System.out.println("prime number");
        }

    }
}
