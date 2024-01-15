package chapter03_conditional_loop;

import java.util.Scanner;

public class perimeter_of_rhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter side of rhombus : ");
        double side=sc.nextDouble();

        System.out.println("Perimeter of rhombus : "+(4*side));
        sc.close();
    }
}
