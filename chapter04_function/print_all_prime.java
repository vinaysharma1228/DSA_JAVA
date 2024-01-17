package chapter04_function;

import java.util.Scanner;

public class print_all_prime {

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

    public static void printAllPrimeNumber(int start,int end)
    {
        for(int i=start;i<=end;i++)
        {
            if (checkPrimeNumber(i)) {

                System.out.print(i+" ");
                
            }
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter start number : ");
        int start=sc.nextInt();

        System.out.println("Enter end number:");
        int end=sc.nextInt();

        sc.close();

        printAllPrimeNumber(start, end);
    }
}
