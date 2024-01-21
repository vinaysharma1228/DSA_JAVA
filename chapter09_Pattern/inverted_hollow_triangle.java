package chapter09_Pattern;

import java.util.Scanner;

public class inverted_hollow_triangle {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter Rows: ");
        int rows = sc.nextInt();

        for (int i = rows; i >=1; i--) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= 2 * i - 1; k++) {
                if (k == 1 || k == 2 * i - 1 || i == rows) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
        sc.close();
    }
}
