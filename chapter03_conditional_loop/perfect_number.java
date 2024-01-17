package chapter03_conditional_loop;

import java.util.Scanner;

public class perfect_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number to check perfect number: ");
        int num=sc.nextInt();
        sc.close();

        int sum=0;

        for(int i=1;i<=num/2;i++)
        {
            if(num%i==0)
            {
                sum+=i;
            }
        }
        if (sum==num) {
            System.out.println(num+" is perfect number.");
        }
        else{   
            System.out.println(num+" is not perfect number.");
        }
    }
}
