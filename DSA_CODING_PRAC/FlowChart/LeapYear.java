package FlowChart;

import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        System.out.println("enter the year to check whether leap year or not : ");
        Scanner scanner=new Scanner(System.in);
        int year = scanner.nextInt();
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.printf("%d is a year ",year);
        }else {
            System.out.printf("%d is mot a leap year ",year);
        }
    }
}
