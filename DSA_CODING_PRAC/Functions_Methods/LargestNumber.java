package Functions_Methods;

import java.util.Scanner;

public class LargestNumber {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.print("Enter three numbers :- ");

        int a = input.nextInt();;

        int b= input.nextInt();

        int c= input.nextInt();;

        System.out.println("largest number in three numbers :- "+largestNumber(a,b,c));
        System.out.println("smallest number in three numbers :- "+smallestNumber(a,b,c));
    }

    static int largestNumber(int num1,int num2,int num3){
         return  Math.max(num3,Math.max(num1,num2));
    }
    static int smallestNumber(int num1,int num2,int num3){
        return  Math.min(num3,Math.min(num1,num2));
    }
}
