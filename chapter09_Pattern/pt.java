package chapter09_Pattern;


public class pt {
    public static void main(String[] args) {
        int n=6;

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n-i;j++)
            {
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++)
            {
                System.out.print(binomialCoefficient(i,j)+" ");
            }

            System.out.println();
        }
    }

    private static int  binomialCoefficient(int i, int j) {
     
         if(j==0 || j==i)
         {
            return 1;
         }
         else{
            return binomialCoefficient(i-1, j-1)+binomialCoefficient(i-1, j);
         }
         
    }
}
