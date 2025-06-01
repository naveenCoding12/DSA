package Arrays.Assignment.Medium;

public class SetZero {
    public static void main(String[] args) {
        int[][] matrix = {{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};

        int m = matrix.length;
        int n = matrix[0].length;
        boolean isFirstRowZero = false;
        boolean isFirstColZero = false;

        // check first row has zero
        for (int j = 0; j < n; j++) {
            if (matrix[0][j] == 0) {
                isFirstRowZero = true;
                break;
            }
        }
        // check for first col has zero
        for (int[] ints : matrix) {
            if (ints[0] == 0) {
                isFirstColZero = true;
                break;
            }
        }

        // create marker of zero in first row
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        //set marker to zeros
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }

        if (isFirstRowZero) {
            for (int j = 0; j < n; j++) {
                matrix[0][j] = 0;
            }
        }
        if (isFirstColZero) {
            for (int i = 0; i < m; i++) {
                matrix[i][0] = 0;
            }
        }
    }
}
