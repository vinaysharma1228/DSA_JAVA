package chapter03_conditional_loop;

import java.util.Scanner;

public class area_of_Equilateral_triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Equilateral Triangle : ");
        double side=sc.nextDouble();

        System.out.println("Area of Equilateral Triangle: " + String.format("%.2f", (Math.sqrt(3) * side * side) / 4));

        sc.close();
    }
    
}
