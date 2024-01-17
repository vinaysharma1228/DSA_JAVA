package chapter04_function;

import java.util.Scanner;

public class eligible_for_vote {

    public static boolean checkEligibilityForVote(int age)
    {
        return (age>=18)?true:false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your age: ");
        int age=sc.nextInt();

        sc.close();

        if(checkEligibilityForVote(age))
        {

            System.out.println("Eligible for vote .");
        }
        else{
            System.out.println("Not Eligible for vote.");

        }

    }
}
