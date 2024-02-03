package chapter09_Pattern;

public class hollow_rectangle {
    public static void main(String[] args) {
        /*
         * 
         *    *****
         *    *   *
         *    *   *
         *    *****
         * 
         * 
         */

         int rows=4;
         for(int i=1;i<=rows;i++)
         {
            for(int j=1;j<=rows+1;j++)
            {
                if(i==1 || i==rows || j==1 || j==rows+1)
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
