package chapter03_conditional_loop;
import java.util.*;

public class area_of_rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter base of rectangle: ");
        double base=sc.nextDouble();

        System.out.print("Enter height of rectangle: ");
        double height=sc.nextDouble();

        System.out.println("Area of Rectangle: "+(base*height));
        sc.close();
    }
    
}
