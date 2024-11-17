package DSA_Maths.Bitwise;

public class NumberOFDigits {

    public static void main(String[] args) {

        int n=8;
        int out=(int)(Math.log(n)/Math.log(2))+1;
        System.out.println(out);
    }
}
