package chapter09_Pattern;

public class hollow_rhombus_pattern {
    public static void main(String[] args) {
        
        int rows=5;

        for(int i=1;i<=rows;i++)
        {
            for(int space=1;space<=rows-i;space++)
            {
                System.out.print(" ");
            }

            for(int j=1;j<=rows;j++)
            {
                if (j == 1 || j == rows || i == 1 || i == rows) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
