package chapter03_conditional_loop;

import java.util.Scanner;

// ci=p(1+(r/100))^n -p;
public class calculate_compound_interest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter principal amount: ");
        double amount=sc.nextDouble();
        System.out.println("Enter  time: ");
        double time=sc.nextDouble();
        System.out.println("Enter  rate: ");
        double rate=sc.nextDouble();

        double one_plus_r_divideBy100=1+(rate/100);
        double nTime=Math.pow(one_plus_r_divideBy100, time);

        System.out.println("Compound Interest : "+((amount*nTime)-amount));
        sc.close();



    }
}
