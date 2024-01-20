package chapter09_Pattern;

import java.util.Scanner;

public class star_rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Rows: ");
        int rows=sc.nextInt();

        for(int i=1;i<=rows;i++)
        {
            for(int j=1;j<=rows;j++)
            {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
