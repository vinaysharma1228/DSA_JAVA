package chapter03_conditional_loop;

import java.util.Scanner;

public class enter_0_toStop {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        

        int sum=0;
        while (true) {
            System.out.print("Enter number or 0 to stop: ");
            int num=sc.nextInt();

            if(num==0)
            {
                break;
            }

            sum+=num;
            
        }
        System.out.println("Sum of all enter number: "+sum);
        sc.close();
    }
}
