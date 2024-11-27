package Recursion;

public class  Recursive {

  public static void main(String[] args) {

    System.out.println("n th Fibonacci number is " + fib(6));
  }

  public static int fib(int n){
    // base conditions
    if(n==0){
      return 0;
    }
    if(n==1){
      return 1;
    }
    return fib(n-1)+fib(n-2);
  }
}
