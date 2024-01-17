package chapter03_conditional_loop;

import java.util.Scanner;

public class power_in_java {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter base : ");
        int base=sc.nextInt();

        System.out.println("Enter exponent: ");
        int exponent=sc.nextInt();

        System.out.println("Power is: "+Math.pow(base, exponent));

        sc.close();
    }
}
