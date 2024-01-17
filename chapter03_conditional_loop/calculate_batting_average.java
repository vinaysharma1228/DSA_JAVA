package chapter03_conditional_loop;

import java.util.Scanner;

public class calculate_batting_average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter run score by batman: ");
        double run=sc.nextDouble();

        System.out.println("Enter number of out : ");
        double out=sc.nextDouble();


        System.out.println("Batting Average : "+String.format("%.2f",(float)(run/out)));
        sc.close();
    }
}
