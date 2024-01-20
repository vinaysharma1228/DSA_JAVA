package chapter09_Pattern;

import java.util.Scanner;

public class reverse_triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Rows: ");
        int rows=sc.nextInt();

        for (int i = rows; i >= 1; i--) {
            // Print spaces before asterisks
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }

            // Print asterisks
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }

            // Move to the next line
            System.out.println();
        }
        sc.close();

    }
}
