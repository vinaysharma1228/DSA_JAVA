package chapter09_Pattern;

public class hollow_butterfly_pattern {
    public static void main(String[] args) {
        /*
         
       *        *
       **      **
       * *    * *
       *  *  *  *
       *   **   *
       *   **   *
       *  *  *  *
       * *    * *
       **      **
       *        *
             
          
         */
        
        int row=10;

        // upper part....
        for(int i=1;i<=row;i++)
        {
            for(int j=1;j<=i;j++)
            {
                if(j==1 || j==i)
                {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }

            for(int k=1;k<=row-i;k++)
            {
                System.out.print(" ");
            }

            for(int k=1;k<=row-i;k++)
            {
                System.out.print(" ");
            }

            for(int j=1;j<=i;j++)
            {
                if(j==1 || j==i)
                {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }

            


            System.out.println();
        }

        // lower part....

         for(int i=1;i<=row;i++)
         {
             for(int j=1;j<=row-i+1;j++)
             {
                 if(j==1 || j==row-i+1)
                 {
                     System.out.print("*");
                 }
                 else{
                     System.out.print(" ");
                 }
             }
 
             for(int k=1;k<=i-1;k++)
             {
                 System.out.print(" ");
             }
 
             for(int k=1;k<=i-1;k++)
             {
                 System.out.print(" ");
             }
 
             for(int j=1;j<=row-i+1;j++)
             {
                 if(j==1 || j==row-i+1)
                 {
                     System.out.print("*");
                 }
                 else{
                     System.out.print(" ");
                 }
             }
 
             
 
 
             System.out.println();
         }


    }
}
