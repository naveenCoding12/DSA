package DSA_Maths;

public class IThbit {

    public static void main(String[] args) {
        System.out.println(ibit(6));
    }

    private static int  ibit(int n) {
        // 011
        return n&(1<<(n-1));
    }
}
