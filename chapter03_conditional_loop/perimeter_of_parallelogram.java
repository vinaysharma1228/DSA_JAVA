package chapter03_conditional_loop;

import java.util.Scanner;

public class perimeter_of_parallelogram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side of parallelogram: ");
        double side=sc.nextDouble();

        System.out.print("Enter base of parallelogram: ");
        double base=sc.nextDouble();

        System.out.println("Perimeter of parallelogram : "+(2*(base+side))+" units");
        sc.close();
    }
}
