package chapter03_conditional_loop;
import java.util.*;

// area of triangle 1/2 b*h
public class area_of_triangle {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter base of triangle : ");
        double base=sc.nextDouble();

        System.out.print("Enter heigth of triangle: ");
        double heigth=sc.nextDouble();

        System.out.println("Area of Triangle : "+(0.5*base*heigth));


        sc.close();

    }
    
}
