package chapter03_conditional_loop;

import java.util.Scanner;

public class Check_armstrong_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to check Armstrong number: ");
        int number=sc.nextInt();

        int sum=0;
        int ori_num=number;

        while (number!=0) {
            int digit=number%10;
            sum+=(digit*digit*digit);
            number=number/10;
        }

        if(sum==ori_num)
        {
            System.out.println(ori_num+" is Armstrong Number.");
        }
        else{
            System.out.println(ori_num+" is Not Armstrong Number.");
        }


        sc.close();
    }
}
