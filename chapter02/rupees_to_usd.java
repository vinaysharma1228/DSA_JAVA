package chapter02;
import java.util.*;

public class rupees_to_usd {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter amount in rupees: ");
        double rupees=sc.nextDouble();

        double dollar=0.012;

        System.out.println("The USD of RS "+rupees+" is : "+"$"+(dollar*rupees));

        sc.close();
    }

    
    
}
