import java.util.*;
public class lcm_hcf {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1,num2,temp,temp1,temp2,lcm,hcf;
        System.out.print("Enter first number: ");
        num1=sc.nextInt();
        System.out.print("Enter second number: ");
        num2=sc.nextInt();

        temp1=num1;
        temp2=num2;

        while (temp2!=0) {
            temp=temp2;
            temp2=temp1%temp2;
            temp1=temp;
        }

        hcf=temp1;
        lcm=(num1*num2)/hcf;

        System.out.println("HCF: "+hcf);
        System.out.println("LCM: "+lcm);


        sc.close();
    }
}
