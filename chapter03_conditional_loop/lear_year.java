package chapter03_conditional_loop;

import java.util.Scanner;

public class lear_year {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Year to check leap or not: ");
        int year=sc.nextInt();
        sc.close();

        if((year%4==0 && year%100!=0) || year%400==0)
        {
            System.out.println(year+" is leap year.");
        }
        else{
            System.out.println(year+" is not leap year.");
        }
    }
}
