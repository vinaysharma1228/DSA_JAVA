package chapter02;
import java.util.*;
public class Fibonacci_series {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter terms to print fibonacci series: ");
        int term=sc.nextInt();

        int first=0,second=1;
        System.out.println("Fibonacci Series: ");

        System.out.print(first+" "+second+" ");

        for(int i=2;i<term;i++)
        {
            int sum=first+second;
            System.out.print(sum+" ");
            first=second;
            second=sum;
        }



        sc.close();
    }
    
}
