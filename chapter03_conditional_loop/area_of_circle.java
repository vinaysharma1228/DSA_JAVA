package chapter03_conditional_loop;

import java.util.*;

//area of cicle formula-> A=πr2

public class area_of_circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius of circle: ");
        double radius=sc.nextDouble();

        System.out.println("Area of circle is : "+(3.14 * radius*radius));
        
        sc.close();
        
    }
}
