package DSA_Maths;

public class UniqueNumber {

    public static void main(String[] args) {
        int[] arr = {2, 3, 2, 4, 3, 4, 5};
        System.out.println(findUniqueElement(arr));  // Expected output: 5
    }

    private static int findUniqueElement(int[] arr) {
        int unique = 0;

        for (int n : arr) {
            unique ^= n;
        }

        return unique;
    }
}
