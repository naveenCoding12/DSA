package FristJava;

import java.util.Scanner;

public class Interest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 1 if you want to calculate Simple Interest or 0 for Compound Interest: ");
        int choice = scanner.nextInt();
        boolean isSimple = (choice == 1);
        System.out.print("Enter the principal amount: ");
        double amount = scanner.nextDouble();

        System.out.print("Enter the time (in years): ");
        int time = scanner.nextInt();

        System.out.print("Enter the interest rate: ");
        float interest = scanner.nextFloat();

        if (isSimple) {
            double si = simple(amount, time, interest);
            System.out.printf("Simple Interest for %.2f, %d years at %.2f%% is: %.2f%n", amount, time, interest, si);
        } else {
            double ci = compound(amount, time, interest);
            System.out.printf("Compound Interest for %.2f, %d years at %.2f%% is: %.2f%n", amount, time, interest, ci);
        }

        scanner.close();
    }

    // Simple Interest Formula
    static double simple(double amount, int time, float rate) {
        return (amount * time * rate) / 100;
    }

    // Compound Interest Formula
    static double compound(double amount, int time, float rate) {
        return amount * Math.pow((1 + rate / 100), time) - amount;
    }
}
