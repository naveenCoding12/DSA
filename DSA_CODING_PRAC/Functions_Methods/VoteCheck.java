package Functions_Methods;

import java.util.Scanner;

public class VoteCheck {

    public static void main(String[] args) {

        System.out.print("enter the age for vote check :- ");

        Scanner input=new Scanner(System.in);

        int age=input.nextInt();

        System.out.print("Enter the name of the person  :-  ");

        String name= input.next();;

        if(isVoteEligible(age)){
            System.out.println(name+"is eligible for vote ");
        }
        else{
            System.out.println(name+"is not  eligible for vote ");
        }
    }

    static boolean isVoteEligible(int age){
        return  age>18 ;
    }
}
