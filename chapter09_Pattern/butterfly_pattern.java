package chapter09_Pattern;

public class butterfly_pattern {
    public static void main(String[] args) {
        
        /*
              BUTTERFLY..-> 🦋       

         *      *      *
         *      **    **
         *      ***  ***
         *      ********
         *      ********
         *      ***  ***
         *      **    **
         *      *      *
         * 
         * 
         */
        
        
        int rows=10;

        // upper part...
        for(int i=1;i<=rows;i++)
        {
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }

            //printing spaces...

            for(int space=1;space<=rows-i;space++)
            {
                System.out.print(" ");
            }

            //printing next spaces 

            for(int space=1;space<=rows-i;space++)
            {
                System.out.print(" ");
            }

            // printing last asterisk

            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }

            System.out.println();
        }


        // lower part...
        for(int i=1;i<=rows;i++)
        {
            for(int j=1;j<=rows-i+1;j++){
                System.out.print("*");
            }

            //printing spaces...

            for(int space=1;space<=i-1;space++)
            {
                System.out.print(" ");
            }

            //printing next spaces 

            for(int space=1;space<=i-1;space++)
            {
                System.out.print(" ");
            }

            // printing last asterisk

            for(int j=1;j<=rows-i+1;j++)
            {
                System.out.print("*");
            }

            System.out.println();
        }

    }
}
