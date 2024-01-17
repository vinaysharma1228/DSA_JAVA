package chapter04_function;

import java.util.Scanner;

public class palindrome_check {

    public static boolean checkPalindrome(int num)
    {
        int ori_num=num;
        int rev=0;

        while (num!=0) {
            int a=num%10;
            rev=(rev*10)+a;
            num/=10;
        }

        if(rev==ori_num)
        {
            return true;
        }

        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number to check palindrome: ");

        while (!sc.hasNextInt()) {
            System.out.println("Invalid input. Please enter a valid number: ");
            sc.next(); 
        }
        int num=sc.nextInt();
 
        sc.close();

        if(checkPalindrome(num))
        {
            System.out.println(num+" is palindrome number.");
        }

        else{
            System.out.println(num+" is not palindrome number.");

        }
    }
}
