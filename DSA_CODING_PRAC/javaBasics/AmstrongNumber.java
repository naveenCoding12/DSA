package javaBasics;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Scanner;

public class AmstrongNumber {

    public static void main(String[] args) {

        System.out.println("Enter the lower bound number :-");

        Scanner input=new Scanner(System.in);

        int lower= input.nextInt();;

        System.out.println("Enter the upper bound :-");

        int upper= input.nextInt();;

        System.out.println("Amstrong number in between "+ lower +" and "+ upper);

        for (int i=lower;i<=upper;i++){
            if(isAmstrong(i)){
                System.out.println(i);
            }
        }
    }

    public static boolean isAmstrong(int n){

        int originalNumber=n;
        int numOfDigits=String.valueOf(n).length();
        int sum=0;
        while(n!=0){
            int digit=n%10;
            sum= (int) (sum+Math.pow(digit,numOfDigits));
            n/=10;
        }
        return originalNumber==sum;
    }
}
