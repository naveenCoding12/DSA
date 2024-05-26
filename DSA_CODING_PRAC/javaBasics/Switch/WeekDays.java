package javaBasics.Switch;

import java.util.Scanner;

public class WeekDays {

    public static void main(String[] args) {

        System.out.print("Enter the number 1 to 7 :- ");

        Scanner input=new Scanner(System.in);

        int number = input.nextInt();;

        switch (number){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("you are in week days :- ");
                break;
            case 6:
            case 7:
                System.out.println("you are in  week end  days ");
                break;
            default:
                System.out.println("please Enter the number in between 1 and 7 :- ");
        }
    }
}
