package chapter03_conditional_loop;

import java.util.Scanner;

public class NumberSumCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sumNegative = 0;
        int sumPositiveEven = 0;
        int sumPositiveOdd = 0;

        System.out.println("Enter a list of numbers. Enter 0 to terminate the list:");

        int num;
        do {
            num = sc.nextInt();

            if (num < 0) {
                sumNegative += num;
            } else if (num > 0) {
                if (num % 2 == 0) {
                    sumPositiveEven += num;
                } else {
                    sumPositiveOdd += num;
                }
            }

        } while (num != 0);

        System.out.println("Sum of negative numbers: " + sumNegative);
        System.out.println("Sum of positive even numbers: " + sumPositiveEven);
        System.out.println("Sum of positive odd numbers: " + sumPositiveOdd);

        sc.close();
    }
}

