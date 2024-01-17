package chapter03_conditional_loop;

import java.util.Scanner;

public class discount_of_product {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter product price : ");
        double amount=sc.nextDouble();
        System.out.print("Enter product discount rate : ");
        double discount_rate=sc.nextDouble();

        double discount_amount=(amount*discount_rate)/100;

        System.out.println("Discount price:"+discount_amount);
        System.out.println("After discount product price: "+(amount-discount_amount));
        sc.close();
    }
}
