package chapter04_function;

import java.util.Scanner;

public class circumference_area_of_circle {

    public static void findCircumferenceOfCircle(double radius)
    {
        double circumference=(2*3.14*radius);

        System.out.println("Circumference of circle is : "+String.format("%.2f",circumference));
    }

    public static void findAreaOfCircle(double radius)
    {
        double area=(3.14*radius*radius);
        System.out.println("Area of Circle is : "+String.format("%.2f",area));
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.print("Enter radius of circle: ");
        double radius=sc.nextDouble();
        sc.close();

        findCircumferenceOfCircle(radius);
        findAreaOfCircle(radius);
    }
}
