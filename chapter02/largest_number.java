package chapter02;
import java.util.*;

public class largest_number {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number : ");
        int num1=sc.nextInt();
        System.out.println("Enter second number : ");
        int num2=sc.nextInt();

        if(num1>num2)
        {
            System.out.println(num1+" is largest.");
        }
        else{
            System.out.println(num2+" is largest.");

        }
        sc.close();
    }
}
