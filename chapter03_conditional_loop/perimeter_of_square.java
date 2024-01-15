package chapter03_conditional_loop;

import java.util.Scanner;

public class perimeter_of_square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter side of Square : ");
        double side=sc.nextDouble();

        System.out.println("Perimeter of Square : "+(4*side));
        sc.close();
    }
}
