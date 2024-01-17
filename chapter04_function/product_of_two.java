package chapter04_function;

import java.util.Scanner;

public class product_of_two {

    public static int productOfTwoNum(int num1,int num2)
    {
        return num1*num2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1=sc.nextInt();
        System.out.print("Enter second number: ");
        int num2=sc.nextInt();

        sc.close();

        System.out.println("Product of "+num1+" and "+num2+" is : "+productOfTwoNum(num1, num2));
    }
}
