package chapter04_function;

import java.util.Scanner;

public class sum_of_n_natural {

    public static int findSumOfNaturalNumber(int num)
    {
        if(num==1)
        {
            return 1;
        }
        return num+findSumOfNaturalNumber(num-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n:");
        int num=sc.nextInt();
        

        System.out.println("Sum of "+num+" natural number is : "+findSumOfNaturalNumber(num));

        sc.close();
    }
}
