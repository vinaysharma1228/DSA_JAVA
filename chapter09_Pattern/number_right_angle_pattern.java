package chapter09_Pattern;

import java.util.Scanner;

public class number_right_angle_pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Rows: ");
        int rows=sc.nextInt();

        for(int i=1;i<=rows;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
