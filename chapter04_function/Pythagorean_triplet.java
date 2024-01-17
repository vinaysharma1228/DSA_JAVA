package chapter04_function;

import java.util.Scanner;

public class Pythagorean_triplet {

    public static boolean findPythagoreanTriplet(int h,int p,int b)
    {
        h=h*h;
        p=p*p;
        b=b*b;

        if(h==(p+b))
        {
            return true;
        }

        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter H:");
        int h=sc.nextInt();

        System.out.print("Enter P:");
        int p=sc.nextInt();

        System.out.print("Enter B:");
        int b=sc.nextInt();

        if(findPythagoreanTriplet(h, p, b))
        {
            System.out.println("Pythagorean triplet");
        }
        else{
            System.out.println(" Not Pythagorean triplet");

        }
    }
}
