package FristJava;

import java.util.Scanner;

public class RupeeToUSD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Example conversion rate (You can update it)
        final double USD_RATE = 0.01183;  // 1 INR = 0.012 USD (approx, update as needed)

        System.out.print("Enter amount in Indian Rupees (INR): ");
        double rupees = scanner.nextDouble();

        double usd = rupees * USD_RATE;

        System.out.printf("%.2f INR is equal to %.2f USD%n", rupees, usd);

        scanner.close();
    }
}
