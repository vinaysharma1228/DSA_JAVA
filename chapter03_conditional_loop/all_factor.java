package chapter03_conditional_loop;

import java.util.Scanner;

public class all_factor {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.print("Enter number to find all factor: ");
        int num=sc.nextInt();

        for(int i=1;i<=num;i++)
        {
            if(num%i==0)
            {
                System.out.print(i+" ");
            }
        }
        sc.close();
    }
}
