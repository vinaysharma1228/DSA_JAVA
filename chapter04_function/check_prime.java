package chapter04_function;

import java.util.Scanner;

public class check_prime {

    public static boolean checkPrimeNumber(int num)
    {
    
        if(num<2)
        {
            return false;
        }
        
        for(int i=2;i<=Math.sqrt(num);i++)
        {
            if(num%i==0)
            {
                return false;
            }
        }
       

        return true;
       
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int num=sc.nextInt();

        sc.close();

        if(checkPrimeNumber(num))
        {
            System.out.println(num+" is prime number.");
        }
        else{
            System.out.println(num+" is Not prime number.");
        }


    }
}
