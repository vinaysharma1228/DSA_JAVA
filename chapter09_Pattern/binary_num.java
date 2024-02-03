
/*
 * 22  1
       0 1
       1 0 1
       0 1 0 1
       1 0 1 0 1

 */


package chapter09_Pattern;

import java.util.Scanner;

public class binary_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter number of row: ");
        int row=sc.nextInt();
       

        for(int i=1;i<=row;i++)
        {

            int value = (i % 2 == 0) ? 0 : 1; 

            for(int j=1;j<=i;j++)
            {
                System.out.print(value+" ");
                value=1-value;
                
               
            }

            System.out.println();

        
       }

        sc.close();
    }
}
