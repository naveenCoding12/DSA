package Recursion.Level1;

public class ReverseNumber {


    public static int helper(int n) {
        if (n < 10) {
            return n;
        }
        int numberOfDigits = (int) Math.log10(n);
        return (n % 10) * (int) Math.pow(10, numberOfDigits) + helper(n / 10);
    }


    public static void main(String[] args) {
        helper(54321);
//        System.out.println(sum);
    }
}
