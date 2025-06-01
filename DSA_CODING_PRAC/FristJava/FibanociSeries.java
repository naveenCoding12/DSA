package FristJava;

import java.util.Scanner;

public class FibanociSeries {

    public static void main(String[] args) {
        System.out.println("Enter the number to calculate upto : ");
        Scanner scanner=new Scanner(System.in);
        int num= scanner.nextInt();
        if(num<0){
            System.out.println("Please provide valid positive number :- ");
        }
        else {
            System.out.println("financial series up to  "+num+" is = ");
            for (int i =0 ;i<num;i++){
                System.out.print(fibanoci(i)+" ");
            }
        }
    }
    public static int fibanoci(int n){
        if (n==0) {
            return 0;
        }
        if(n==1){
            return 1;
        }
        return fibanoci(n-1)+fibanoci(n-2);

    }
}
