package chapter03_conditional_loop;

import java.util.Scanner;


public class perimeter_of_circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter radius of circle: ");
        double radius=sc.nextDouble();

        System.out.println("Perimeter of Circle : "+(2*3.14*radius));
        sc.close();
    }
}
