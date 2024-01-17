package chapter04_function;

import java.util.Scanner;

public class even_odd {

    public static boolean checkOddEven(int num)
    {
        return (num%2==0)?true:false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number to check odd or even: ");
        int num=sc.nextInt();

        sc.close();

        if(checkOddEven(num))
        {
            System.out.println(num+" is even number.");
        }
        else{
            System.out.println(num+" is odd number.");
        }

    }
}
