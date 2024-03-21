package chapter09_Pattern;

public class arrow_pattern {

  
        // Upper half of the diamond
        public static void printPattern(int rows) {
            // Upper half of the pattern
            for (int i = 1; i <= rows; i += 2) {
                for (int j = 0; j < (rows - i) / 2; j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
    
            // Middle part of the pattern
            for (int i = 0; i < rows * 2; i++) {
                System.out.print("*");
            }
            System.out.println();
    
            // Lower half of the pattern
            for (int i = rows - 2; i > 0; i -= 2) {
                for (int j = 0; j < (rows - i) / 2; j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    public static void main(String[] args) {

        /*
         // print this pattern if you can: 

        
		          *
		          ***
		          *****
*************************
***************************
*************************
		          *****
		          ***
		          *
         */
      //  int rows = 11; // Number of rows in the diamond
       // printPattern(rows);

       System.out.println("                                    *");
       System.out.println("                                    ***");
       System.out.println("                                    *****");
       System.out.println("*******************************************");
       System.out.println("*********************************************");
       System.out.println("*******************************************");
       System.out.println("                                    *****");
       System.out.println("                                    ***");
       System.out.println("                                    *");


    }
}
