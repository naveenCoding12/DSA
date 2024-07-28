package Recursion;

public class Factorial {

  public static void main(String[] args) {

    System.out.println("factorial of a number "+factorial(4));
  }

   static int factorial(int n){
    // base condition
    if (n==0 ||  n==1){
      return 1;
    }
    return n*factorial(n-1);

  }
}
