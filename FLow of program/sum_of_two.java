
import java.util.Scanner;

public class sum_of_two {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1=sc.nextInt();
        System.out.print("Enter Second number: ");
        int num2=sc.nextInt();

        System.out.println("Sum of "+num1+" and "+num2+"is : "+(num1+num2));


        sc.close();
    }
}
