package javaBasics.Switch;

import java.util.Scanner;

public class FruitExample {

    public static void main(String[] args) {

        System.out.print("Enter the fruit : - ");

        Scanner input=new Scanner(System.in);

        String fruit= input.next();

        switch (fruit){

            case "Mango":
                         System.out.println("Mango is the king of king  fruit :- ");
                         break;
            case "Apple":
                        System.out.println("Red fruit ");
                        break;
            case  "orange":
                        System.out.println("round fruit :- ");
                        break;

            default:
                System.out.println("please enter valid fruit name ");

        }

    }
}
