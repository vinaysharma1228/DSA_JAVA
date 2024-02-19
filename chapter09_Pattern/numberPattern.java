
/*
 * 
 * 
 *     1      1
       12    21
       123  321
       12344321
 */

 package chapter09_Pattern;
 
 /**
  * numberPattern
  */
 public class numberPattern {
 public static void main(String[] args) {
    
    int num=4;

    for(int i=1;i<=num;i++)
    {
        for(int j=1;j<=i;j++)
        {
            System.out.print(j);
        }

        for(int space=1;space<=num-i;space++)
        {
            System.out.print(" ");
        }

        for(int space=1;space<=num-i;space++)
        {
            System.out.print(" ");
        }

        for(int j=i;j>=1;j--)
        {
            System.out.print(j);
        }

        System.out.println();



    }
 }
    
 }