package chapter03_conditional_loop;

import java.util.Scanner;

public class distance_between_two_point {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x1,x2,y1,y2;
        System.out.print("Enter X1: ");
        x1=sc.nextInt();
        System.out.print("Enter X2: ");
        x2=sc.nextInt();
        System.out.print("Enter y1: ");
        y1=sc.nextInt();
        System.out.print("Enter y2: ");
        y2=sc.nextInt();

        int x2_Minus_x1_Square=(x2-x1)*(x2-x1);
        int y2_Minnus_y1_Square=(y2-y1)*(y2-y1);

        System.out.println("Distanse of ("+x1+","+x2+")"+" and ("+y1+","+y2+") is : "+Math.sqrt(x2_Minus_x1_Square+y2_Minnus_y1_Square));



        sc.close();
    }
}
