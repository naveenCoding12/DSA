package FlowChart;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        System.out.println("Enter the number to which you have the multiplication table : ");
        Scanner scanner=new Scanner(System.in);
        int num= scanner.nextInt();
        System.out.printf("Multiplication table for %d",num);
        System.out.println();
        for (int i=1 ;i<=10 ;i++){
            System.out.printf("%d * %d = %d",num,i,(num*i));
            System.out.println();
        }
        scanner.close();
    }
}
