package chapter03_conditional_loop;

import java.util.Scanner;

public class find_ncr_npr {

    public static long Factorial(long n)
    {
        long fact=1;
        for(int i=1;i<=n;i++)
        {
            fact*=i;
        }

        return fact;
    }

    public static void findNpr_Ncr(long n,long r)
    {

        long Nfactorial=Factorial(n);
        long Rfactorial=Factorial(r);
        long n_minus_r_factorial=Factorial(n-r);

        double ncr=(Nfactorial/(Rfactorial*n_minus_r_factorial));
        double npr=(Nfactorial/n_minus_r_factorial);

        System.out.println("NCR : "+ncr);
        System.out.println("NPR : "+npr);

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter  n : ");
        long n=sc.nextLong();

        System.out.println("Enter r : ");
        long r=sc.nextLong();

        findNpr_Ncr(n,r);

        sc.close();

    }
}
