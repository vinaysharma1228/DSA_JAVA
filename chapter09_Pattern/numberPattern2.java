package chapter09_Pattern;

public class numberPattern2 {
    public static void main(String[] args) {
        /*
          
          
      1 1 1 1 1 1
      2 2 2 2 2
      3 3 3 3
      4 4 4
      5 5
      6
          
          
         */

     int rows=6;

     for(int i=1;i<=rows;i++)
     {
        for(int j=1;j<=rows-i+1;j++)
        {
            System.out.print(i+" ");
        }

        System.out.println();
     }
    

    }
}
