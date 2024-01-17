package chapter04_function;

import java.util.Scanner;

public class factorial {

    public static long Factorial(long number)
    {
        if(number==0)
        {
            return 1;
        }
        if (number==1) {
            return 1;
        }

        return number * Factorial(number-1);


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number to find factorial: ");
        long number=sc.nextLong();


        System.out.println("Factorial of "+number+"! is : "+Factorial(number));

    }
}
