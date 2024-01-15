package chapter03_conditional_loop;
import java.util.*;
public class area_of_rhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rhombus diagonal 1: ");
        double diagonal1=sc.nextDouble();

        System.out.print("Enter rhombus diagonal 2: ");
        double diagonal2=sc.nextDouble();

        System.out.println("Area of Rectangle: "+(diagonal1*diagonal2)/2);
        sc.close();
    }
    
}
