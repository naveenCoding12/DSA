package Recursion.Level1;

public class SumOfNumbers {

    public static void main(String[] args) {
        System.out.println(sumOf(5));
    }
    static  int sumOf(int n){
        if(n<=1){
            return 1;
        }
        return n+sumOf(n-1);
    }
}
