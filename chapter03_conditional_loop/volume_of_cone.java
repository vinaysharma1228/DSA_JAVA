package chapter03_conditional_loop;

import java.util.Scanner;

public class volume_of_cone {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter radius of Cone: ");
        double radius=sc.nextDouble();

        System.out.print("Enter height of Cone: ");
        double height=sc.nextDouble();

        double pie=3.14;
        double rad_Square=radius*radius;


        System.out.println("Volume of cone: "+(pie*rad_Square*height)/3);

        sc.close();
    }
}
