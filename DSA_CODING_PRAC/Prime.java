import java.util.Scanner;

class Prime {
    public static void main(String[] args) {
        System.out.println("Enter the number to check the prime number : ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int num = 2;
        boolean isPrime = true;

        while (num <= Math.sqrt(number)) {
            if (number % num == 0) {
                isPrime = false;
                break;
            }
            num++;
        }

        if (isPrime && number > 1) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
        
        scanner.close();
    }
}
