package javaBasics.Conditions;

import java.util.Scanner;

public class Caluclator {

    public static void main(String[] args) {
        System.out.println("Enter the Numbers :- ");

        Scanner input=new Scanner(System.in);

        int a=input.nextInt();
        int b= input.nextInt();;

        System.out.println("press the operator to calculate :- ");

        String operator=input.next().trim();

        while(true){
            if (operator.equals("+")){
                System.out.println("Sum of the two numbers :- "+(a+b));
                break;
            }
           else if(operator.equals("-")){
                System.out.println("Difference of two numbers :-"+(a-b));
                break;
            }
           else if(operator.equals("*")){
                System.out.println("multiplication of two numbers :- "+(a*b));
                break;
            }
           else if(operator.equals("/")){
                System.out.println("division of two numbers :- "+(a/b));
                break;
            }
           else{
                System.out.println("please Enter the valid operator + - * /  :- ");
                break;
            }

        }
    }
}
