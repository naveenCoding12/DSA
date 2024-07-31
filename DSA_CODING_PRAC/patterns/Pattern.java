package patterns;

public class Pattern {

    public static void main(String[] args) {

//        pattern2(5);
//        pattern3(5);
//        pattern4(5);
//        pattern5(5);
//        pattern6("Naveen");
//        pattern28(5);
        pattern7(5);
    }

    static void pattern2(int n){
        // outer loop for number of rows
        for (int i = 1; i <=n; i++) {
            // number of columns and number of elements in each row
            for (int j = 1; j <=i; j++) {
                System.out.print("* ");
            }
            System.out.println();

        }
    }
    static void pattern3(int n){

        // number of rows
        for (int i = 0; i < n; i++) {
            // number of columns and how many elements
            for (int j = 0; j <=n-1-i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern4(int n){

        // number of rows
        for (int i = 0; i <n ; i++) {
            // number of columns and type of elements
            for (int j = 0; j <i+1 ; j++) {
                System.out.print(j+1+" ");
            }
            System.out.println();

        }
    }

    static void pattern5(int n){
        // number fo rows
        for (int i = 0; i <2*n ; i++) {
            // number of columns in each row
            int col=i>n?2*n-i:i;
            for (int j = 0; j <col ; j++) {
                System.out.print("* ");
            }
            System.out.println();

        }
    }

    static void pattern6(String s){
        // number of rows
        for (int i = 0; i <2*s.length() ; i++) {
            // number of colmuns
            int col=i>s.length() ? 2*s.length()-i:i;
            for (int j = 0; j < col; j++) {
                System.out.print(s.charAt(j)+" ");
            }
            System.out.println();
        }
    }

    static void pattern28(int n){
        // number of rows
        for (int i = 0; i <2*n ; i++) {
            // number of spaces
            for (int j = 0; j <n- (i>n ? 2*n-i:i); j++) {
                System.out.print(" ");
            }
            int i2 = i > n ? 2 * n - i : i;
            for (int k = 0; k< (i>n ? 2*n-i:i); k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static  void pattern7(int n){

        for (int i = 0; i <n; i++) {
            // Print spaces
            for (int j = n -1-i; j > 0; j--) {
                System.out.print(" ");
            }
            // Print asterisks
            for (int k = 0; k < i; k++) {
                System.out.print("*");
            }
            // Move to the next line
            System.out.println();
        }
    }
}
