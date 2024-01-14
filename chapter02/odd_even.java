package chapter02;
import java.util.*;

public class odd_even {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to check odd even: ");
        int num=sc.nextInt();

        if(num%2==0)
        {
            System.out.println(num+" is Even number.");
        }
        else{
            System.out.println(num+" is odd number.");

        }

        sc.close();
        
    }
    
}
