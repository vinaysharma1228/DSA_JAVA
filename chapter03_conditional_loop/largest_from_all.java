package chapter03_conditional_loop;

import java.util.Scanner;

public class largest_from_all {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int max=0;

        while (true) {
            System.out.print("Enter number or 0 to stop: ");
            int num=sc.nextInt();

            if(num==0)
            {
                break;
            }

            if(num>max)
            {
                max=num;
            }
        }
        System.out.println("Largest number from all is :"+max);
        sc.close();
    }
}
