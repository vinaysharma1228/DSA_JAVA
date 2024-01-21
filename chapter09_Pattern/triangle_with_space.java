package chapter09_Pattern;

import java.util.Scanner;

/**
 * triangle_with_space
 */
public class triangle_with_space {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Rows: ");
        int rows=sc.nextInt();

        for(int i=1;i<=rows;i++)
        {
            for(int j=1;j<=rows-i;j++)
            {
                System.out.print(" ");
            }

            for(int k=1;k<=i;k++)
            {
                System.out.print("*"+" ");
            }

            System.out.println();
        }
        sc.close();
    }
}