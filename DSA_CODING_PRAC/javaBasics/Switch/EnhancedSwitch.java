package javaBasics.Switch;

import java.util.Scanner;

public class EnhancedSwitch {

    public static void main(String[] args) {

        System.out.print("Enter the number 1 to 7 for days :- ");

        Scanner input=new Scanner(System.in);

        int number=input.nextInt();

        switch (number){

            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday ");
            case 6 -> System.out.println("saturday ");
            case 7 -> System.out.println("sunday");
            default -> System.out.println("please Enter the number in between 1 and 7 :- ");
        }
    }
}
