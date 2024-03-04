package _2D_Array;

public class creation2DArray {
    public static void main(String[] args) {
        int matrix[][]=new int[3][3];

         matrix[0][0]=1;
         matrix[0][1]=2;
         matrix[0][2]=3;
         matrix[1][0]=4;
         matrix[1][1]=6;
         matrix[1][2]=7;
         matrix[2][0]=5;
         matrix[2][1]=9;
         matrix[2][2]=4;

         System.out.println("Matrix : 👇");

         for(int i=0;i<matrix.length;i++)
         {
            for(int j=0;j<matrix[0].length;j++)
            {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
         }
    }
}
