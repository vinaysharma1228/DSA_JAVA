package chapter09_Pattern;

public class diamond_star_pattern {
    public static void main(String[] args) {

        /*
         * 
         *              *
         *            * * *
         *          * * * * *
         *        * * * * * * *
         *      * * * * * * * * * 
         *        * * * * * * *  
         *          * * * * *   
         *            * * *    
         *              *    
         */
        
        int rows=10;
       // printing upper part...
        
        // traversing every rows one by one :)
        for(int i=1;i<=rows;i++)
        {
            // printing spaces 
            for(int space=1;space<=rows-i;space++)
            {
                System.out.print(" ");
            }

            //printing asterisks:)

            for(int j=1;j<=(2*i)-1;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        // printing lower part...

        for(int i=1;i<=rows-1;i++)
        {
            // printing spaces 
            for(int space=1;space<=i;space++)
            {
                System.out.print(" ");
            }

            //printing asterisks:)

            for(int j=1;j<=2*((rows-1)-i)+1;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
