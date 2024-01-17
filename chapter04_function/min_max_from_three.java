package chapter04_function;

import java.util.Scanner;

public class min_max_from_three {

    public static void findMaximum(int num1,int num2,int num3)
    {

        int max=num1;

        if(num1>num2 && num1>num3)
        {
            max=num1;
        }
        else if(num2>num1 && num2>num3)
        {
            max=num2;
        }
        else{
            max=num3;
        }

        System.out.println("Greater number Among "+num1+","+num2+","+num3+" is : "+max);
    }

    public static void findMinimum(int num1,int num2,int num3)
    {
        int min=num1;

        if(num1<num2 && num1<num3)
        {
            min=num1;
        }
        else if(num2<num1 && num2<num3)
        {
            min=num2;
        }
        else{
            min=num3;
        }

        System.out.println("Smallest number Among "+num1+","+num2+","+num3+" is : "+min);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1=sc.nextInt();
        System.out.print("Enter second number: ");
        int num2=sc.nextInt();
        System.out.print("Enter third number: ");
        int num3=sc.nextInt();
        sc.close();

        findMaximum(num1,num2,num3);
        findMinimum(num1, num2, num3);
    }
}
