 package chapter03_conditional_loop;

import java.util.Scanner;

class hcf_two_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1,num2,temp,temp1,temp2,hcf;

        System.out.println("Enter first number : ");
        num1=sc.nextInt();
        System.out.println("Enter second number : ");
        num2=sc.nextInt();

        temp1=num1;
        temp2=num2;

        while (temp2!=0) {
            temp=temp2;
            temp2=temp1%temp2;
            temp1=temp;
            
        }

        hcf=temp1;

        System.out.println("HCF of "+num1+" and "+num2+" is : "+hcf);
        sc.close();

    }

    
}