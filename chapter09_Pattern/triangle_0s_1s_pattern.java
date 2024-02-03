package chapter09_Pattern;

public class triangle_0s_1s_pattern {
    public static void main(String[] args) {
        
        /* 
          0s and 1s triangle pattern..
         * 
         * 1
         * 0 1
         * 1 0 1
         * 0 1 0 1
         * 1 0 1 0 1
         * 
         * 
         * 
         * 
         */
         int rows = 5;

         for (int i = 0; i < rows; i++) {
             int numToPrint = i % 2 == 0 ? 1 : 0;
 
        
             // Print numbers
             for (int j = 0; j <= i; j++) {
                 System.out.print(numToPrint + " ");
                 numToPrint = 1 - numToPrint; 
             }
 
             System.out.println();
         }

   
    }
}
