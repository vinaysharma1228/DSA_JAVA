package chapter02;
import java.util.*;

public class armstrong_number_between_two {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1=sc.nextInt();
        System.out.print("Enter second number: ");
        int num2=sc.nextInt();


        System.out.println("All amrstrong number between "+num1+" and "+num2+" : ");
        for(int i=num1;i<=num2;i++)
        
        {
           int j=i;
           int ori_num=i;
           int sum=0;

           while (j!=0) {
            int digit=j%10;
            sum+=(digit*digit*digit);
            j=j/10;
            
           }

           if(sum==ori_num)
           {
            System.out.print(ori_num+" ");
           }

        }
        sc.close();
    }
    
}
