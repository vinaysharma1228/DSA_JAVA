package chapter09_Pattern;

public class solid_rhombus {
    public static void main(String[] args) {
        /*
         * 
         * 
         *               *****
         *              *****
         *             *****
         *            *****
         *           *****
         */

         int rows=5;
         for(int i=1;i<=rows;i++)
         {
            for(int space=1;space<=rows-i;space++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=rows;j++)
            {
                System.out.print("*");
            }
            System.out.println();
         }
    }
}
