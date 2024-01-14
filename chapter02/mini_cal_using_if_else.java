//4. Take in two numbers and an operator (+, -, *, /) and calculate the value.
//(Use if conditions)

package chapter02;
import java.util.*;

public class mini_cal_using_if_else {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int num1=sc.nextInt();

        System.out.println("Enter second number: ");
        int num2=sc.nextInt();

        System.out.println("Enter operator (+,-,*,/)");
        String ch=sc.next();

        if(ch.equals("+"))
        {
            System.out.println("Addition: "+(num1+num2));
        }
        else if(ch.equals("-"))
        {
            System.out.println("Subtraction: "+(num1-num2));

        }
        else if(ch.equals("*"))
        {
            System.out.println("Multiplication: "+(num1*num2));

        }
        else if (ch.equals("/")) {

            System.out.println("Division: "+(double)(num1/num2));  
        }
        else{
            System.out.println("Invalid input..");

        }



        sc.close();
    }
}
