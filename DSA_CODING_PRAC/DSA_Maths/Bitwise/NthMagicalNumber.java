package DSA_Maths.Bitwise;

import java.util.Scanner;

public class NthMagicalNumber {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the number :- ");
        int n=scanner.nextInt();
        System.out.println("Enter what number to need to check magic number :- ");
        int base=scanner.nextInt();
        int ans=0;

        while(n>0){
            int last=n&1;
            n=n>>1;
            ans+=base*last;
            base*=base;
        }

        System.out.println("output :- "+ans);
    }

}
