package chapter03_conditional_loop;

import java.util.Scanner;

public class area_of_parallelogram {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        System.out.print("Enter base of Parallelogram: ");
        double base=sc.nextDouble();

        System.out.print("Enter height of Parallelogram: ");
        double height=sc.nextDouble();

        System.out.println("Area of Parallelogram : "+(base*height));
        sc.close();
    }
    
}
