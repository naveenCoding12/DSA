package Recursion.Level1;

public class SumOfDigits {

    public static void main(String[] args) {
        System.out.println(sumOFDigits(1432));
    }
    static int sumOFDigits(int n){
        if(n<=0){
            return 0;
        }
        return sumOFDigits(n/10)+n%10;
    }
}
