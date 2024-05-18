package javaBasics;

import java.util.Scanner;

public class FibanociSeries {

    public static void main(String[] args) {

        System.out.print("Enter the number : -");

        Scanner input=new Scanner(System.in);

        int number= input.nextInt();;

        if(number<0){
            System.out.println("Please provide valid positive number :- ");
        }
        else {
            System.out.println("financial series up to  "+number+" is = ");
            for (int i =0 ;i<number;i++){
                System.out.print(fibanoci(i)+" ");
            }
        }
    }
    public static int fibanoci(int n){
        if (n==0) {
            return 0;
        }
        if(n==1){
            return 1;
        }
        return fibanoci(n-1)+fibanoci(n-2);

    }
}
