package chapter03_conditional_loop;

import java.util.Scanner;

public class perimeter_of_rectangle {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of rectangle: ");
        double length=sc.nextDouble();

        System.out.print("Enter width of rectangle: ");
        double width=sc.nextDouble();

        System.out.println("Perimeter of parallelogram : "+(2*(width+length)));
        sc.close();
    }
}
