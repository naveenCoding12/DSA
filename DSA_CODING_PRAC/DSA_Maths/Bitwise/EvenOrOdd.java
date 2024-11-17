package DSA_Maths.Bitwise;

public class EvenOrOdd {

    public static void main(String[] args) {
        System.out.println(isEven(7));

    }

    private static boolean isEven(int n) {
        // if the any number and with 1 it gives same number ,we compare the last digit for even or odd
        return (n & 1)==0;
    }
}
