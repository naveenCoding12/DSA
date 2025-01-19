public class NumberPatternRecursive {

    // Method to print numbers in a row
    static void printNumbersInRow(int n) {
        if (n == 0) {
            return; // Base case: no numbers to print
        }
        printNumbersInRow(n - 1); // Recursive call for previous number
        System.out.print(n + " "); // Print current number
    }

    // Method to print rows
    static void printRows(int currentRow, int totalRows) {
        if (currentRow > totalRows) {
            return; // Base case: no more rows to print
        }
        printNumbersInRow(currentRow); // Print numbers in the current row
        System.out.println(); // Move to the next line
        printRows(currentRow + 1, totalRows); // Recursive call for the next row
    }

    public static void main(String[] args) {
        int rows = 5; // Total number of rows
        printRows(1, rows); // Start printing rows from 1
    }
}
