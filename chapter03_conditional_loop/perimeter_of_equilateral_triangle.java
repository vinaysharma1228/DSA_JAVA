package chapter03_conditional_loop;

import java.util.Scanner;

public class perimeter_of_equilateral_triangle {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter side of Equilateral triangle: ");
        double side=sc.nextDouble();

        System.out.println("Perimeter of Equilateral triangle:"+(3*side));
        sc.close();
    }
}
