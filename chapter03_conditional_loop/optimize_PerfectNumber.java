package chapter03_conditional_loop;

import java.util.Scanner;

public class optimize_PerfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number to check perfect number: ");
        int num = sc.nextInt();
        sc.close();

        int sum = 1; // Start with 1 as every number is divisible by 1

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                sum += i;
                if (i != num / i) {
                    sum += num / i;
                }
            }
        }

        if (sum == num) {
            System.out.println(num + " is a perfect number.");
        } else {
            System.out.println(num + " is not a perfect number.");
        }
    }
}
