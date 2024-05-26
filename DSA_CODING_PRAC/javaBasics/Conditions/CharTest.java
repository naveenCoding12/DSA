package javaBasics.Conditions;

import java.util.Scanner;

public class CharTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = scanner.next().trim().charAt(0);

        if (ch >= 'a' && ch <= 'z') {
            System.out.println("Lower case letter");
        } else if (ch >= 'A' && ch <= 'Z') {
            System.out.println("Upper case letter");
        } else {
            System.out.println("Not an alphabet letter");
        }

        scanner.close();
    }
}
