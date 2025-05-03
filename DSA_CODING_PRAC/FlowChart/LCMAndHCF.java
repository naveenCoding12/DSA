package FlowChart;

import java.util.Scanner;

public class LCMAndHCF {
    public static void main(String[] args) {
        System.out.println("Enter the two numbers to find the LCM and HCF : ");
        Scanner scanner=new Scanner(System.in);
        int num1= scanner.nextInt();
        int num2= scanner.nextInt();
        System.out.printf("HCF of %d,%d is %d",num1,num2,findHCF(num1,num2));
        System.out.println();
        System.out.printf("lCM of %d,%d is %d",num1,num2,findLCM(num1,num2));
    }
    static int findHCF(int num1,int num2){
        while (num2!=0){
            int temp=num2;
            num2=num1%num2;
            num1=temp;
        }
        return num1;
    }

    static int findLCM(int num1,int num2){
        return (num1*num2)/findHCF(num1, num2);
    }
}
