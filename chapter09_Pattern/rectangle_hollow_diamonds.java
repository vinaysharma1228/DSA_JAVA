package chapter09_Pattern;

public class rectangle_hollow_diamonds {
    public static void main(String[] args) {
        

         int row=10;

         // upper part...

         for(int i=1;i<=row;i++)
         {
            // first part..

        

            //actually star print..
            for(int j=1;j<=row-i+1;j++)
            {
                System.out.print("*");
            }
            // space print ...
            for(int k=1;k<=i-1;k++)
            {
                System.out.print(" ");
            }

            
            // second part..

            // space print...
            for(int k=1;k<=i-1;k++)
            {
                System.out.print(" ");
            }

            for(int j=1;j<=row-i+1;j++)
            {
                System.out.print("*");
            }

           


            System.out.println();
         }



         // lower part...

         for(int i=1;i<=row;i++)
         {
            // first part..

            //actually star print..
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            // space print ...
            for(int k=1;k<=row-i;k++)
            {
                System.out.print(" ");
            }

            // second part..

            // space print...
            for(int k=1;k<=row-i;k++)
            {
                System.out.print(" ");
            }

            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }


            System.out.println();
         }

    }
}
