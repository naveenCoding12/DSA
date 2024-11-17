package DSA_Maths.Bitwise;

public class SumOfPascalsRow {

    // For each row sum = 2^n;
    // For nth row sum = 2^row - 1 (where row is zero-indexed);

    public static void main(String[] args) {
        int row = 2; // Example row
        System.out.println("Sum of Pascal's row " + row + " is " + sumOfRow(row));
    }

    static int sumOfRow(int row) {
        return 1 << row; // Sum of the nth row of Pascal's triangle is 2^row
    }
}
