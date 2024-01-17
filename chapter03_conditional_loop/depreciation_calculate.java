package chapter03_conditional_loop;

import java.util.Scanner;

/**
 * depreciation_calculate
 */
public class depreciation_calculate {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter amount of machine: ");
        double amount=sc.nextDouble();
        

        System.out.println("Enter depreciation rate : ");
        double rate=sc.nextDouble();

        double depreciationAmount=(amount*rate)/100;
        System.out.println("Depreciation amount : "+depreciationAmount);
        System.out.println("Machine amount after depreciation : "+(amount-depreciationAmount));
        sc.close();
    }
}