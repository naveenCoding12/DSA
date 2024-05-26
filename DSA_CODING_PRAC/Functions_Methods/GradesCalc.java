package Functions_Methods;

import java.util.Scanner;

public class GradesCalc {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the name of the student: ");
        String name = input.nextLine(); // Use nextLine() to read the full name

        System.out.println("Enter the marks to check: ");
        while (!input.hasNextInt()) {
            System.out.println("Invalid input. Please enter an integer value for marks: ");
            input.next(); // Consume the invalid input
        }
        int marks = input.nextInt();

        System.out.println(name + " passed with this Grade: " + gradeCheck(marks));

        input.close();
    }

    static String gradeCheck(int marks) {
        if (marks > 91 && marks <= 100) {
            return "A+";
        } else if (marks > 81 && marks <= 90) {
            return "A";
        } else if (marks > 71 && marks <= 80) {
            return "B+";
        } else if (marks > 61 && marks <= 70) {
            return "B";
        } else if (marks > 51 && marks <= 60) {
            return "C";
        } else if (marks > 41 && marks <= 50) {
            return "D";
        } else {
            return "Fail";
        }
    }
}
