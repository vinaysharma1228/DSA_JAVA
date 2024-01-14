package chapter02;
import java.util.*;

public class simple_interest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter principal Amount: ");
        double Amount=sc.nextDouble();

        System.out.print("Enter time: ");
        double time=sc.nextDouble();

        System.out.print("Enter rate: ");
        double rate=sc.nextDouble();


        double si=(Amount*rate*time)/100;

        System.out.println("Simple interest: "+si);

        sc.close();
        
    }
}
