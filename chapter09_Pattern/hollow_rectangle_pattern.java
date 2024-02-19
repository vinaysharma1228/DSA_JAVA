package chapter09_Pattern;

public class hollow_rectangle_pattern {
    public static void main(String[] args) {
        
        /*
         * 
          
         
       ****
       *  *
       *  *
       *  *
       ****  
       
       
         */
        int row=10;

         for(int i=1;i<=row;i++)
         {

            for(int j=1;j<=row;j++)
            {
                if(i==1 || j==row || i==row || j==1)
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
