
package chapter03_conditional_loop;

import java.util.Scanner;

class electricity_bill {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Electricity Units: ");
        double units=sc.nextDouble();

        double amount;

        if(units<=100)
        {
            amount=(units*4);
        }
        else if(units<=150)
        {
            amount=(100*4)+((units-100)*5);
        }
        else if(units<=200)
        {
            amount=(100*4)+(50*5)+((units-150)*6);
        }
        else if(units<=300)
        {
            amount=(100*4)+(50*5)+(50*6)+((units-200)*8);
        }
        else{
            amount=(100*4)+(50*5)+(50*6)+(100*8)+((units-300)*10);
        }

        System.out.println("Electricity bill of "+units+" units is : "+amount);

        sc.close();
    }
}