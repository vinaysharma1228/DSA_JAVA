import java.util.*;

public class multiplication_of_given_number {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=sc.nextInt();

        System.out.println("Multiplication of "+num+" is given below :");

        for(int i=1;i<=10;i++)
        {
            System.out.println(num+" x "+i+" = "+(num*i));
        }

        sc.close();
    }
}
