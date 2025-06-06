package Recursion.patterns;

public class Pattern1 {

    public static void main(String[] args) {
        pattern(4, 0);
        pattern1(4, 0);
    }

    static void pattern(int row, int col) {
        if (row == 0) {
            return; // Base case to end recursion when rows are complete
        }
        if (col < row) {
            System.out.print("* ");
            pattern(row, col + 1);
        } else {
            System.out.println();
            pattern(row - 1, 0);
        }
    }

    static void pattern1(int row, int col) {
        if (row == 0) {
            return; // Base case to end recursion when rows are complete
        }
        if (col < row) {
            pattern1(row, col + 1);
            System.out.print("* ");
        } else {
            pattern1(row - 1, 0);
            System.out.println();
        }
    }
}
