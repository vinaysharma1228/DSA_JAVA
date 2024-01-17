package chapter03_conditional_loop;

import java.util.Scanner;

public class palindrome_or_not {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number to check palindrome or not: ");
        long number=sc.nextLong();

        long ori_num=number;
        long rev=0;

        while (number!=0) {
            long a=number%10;
            rev=(rev*10)+a;
            number=number/10;
            
        }
        if(ori_num==rev)
        {
            System.out.println(ori_num+" is palindrome number.");
        }
        else{
            System.out.println(ori_num+" is not palindrome number.");
        }
        sc.close();
    }
}
