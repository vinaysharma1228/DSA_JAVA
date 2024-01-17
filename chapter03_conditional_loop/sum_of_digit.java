package chapter03_conditional_loop;

import java.util.Scanner;

public class sum_of_digit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number : ");
        int num=sc.nextInt();

        sc.close();

        int sum=0,ori=num;

        while (num!=0) {
            
            int a=num%10;
            sum+=a;
            num/=10;
        }

        System.out.println("Sum of all digit of "+ori+" is : "+sum);
    }
}
