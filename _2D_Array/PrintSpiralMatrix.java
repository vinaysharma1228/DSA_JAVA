package _2D_Array;


public class PrintSpiralMatrix {
    public static void main(String[] args) {
        
          int matrix[][]=new int[3][3];
          int count=1;
          
          for(int i=0;i<matrix.length;i++)
          {
            for(int j=0;j<matrix[0].length;j++)
            {
                matrix[i][j]=count++;
            }
          }

          System.out.println("Matrix: ");
          for(int i=0;i<matrix.length;i++)
          {
            for(int j=0;j<matrix[0].length;j++)
            {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
          }

          System.out.println();

          int sr=0;
          int er=matrix.length-1;
          int sc=0;
          int ec=matrix[0].length-1;


          while (sr <= er && sc<=ec) {

            // top

            for(int j=sc;j<=ec;j++)
            {
                System.out.print(matrix[sr][j]+" ");
            }

            //right

            for(int i=sr+1;i<=er;i++)
            {
                System.out.print(matrix[i][ec]+" ");
            }

            // bottom

            for(int j=ec-1;j>=sc;j--)
            {
                if(sc==ec)
                {
                    return;
                }
                System.out.print(matrix[er][j]+" ");
            }

            // left

            for(int i=er-1;i>=sr+1;i--)
            {
                System.out.print(matrix[i][sc]+" ");
            }

            sr++;
            er--;
            sc++;
            ec--;
            
          }

        
    }
}

/*
 
package _2D_Array;

public class PrintSpiralMatrix {
    public static void main(String[] args) {

        int matrix[][] = new int[4][4];
        int count = 1;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = count++;
            }
        }

        System.out.println("Matrix: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        int sr = 0;
        int er = matrix.length - 1;
        int sc = 0;
        int ec = matrix[0].length - 1;

        while (sr <= er && sc <= ec) {

            // top
            for (int j = sc; j <= ec; j++) {
                System.out.print(matrix[sr][j] + " ");
            }

            // right
            for (int i = sr + 1; i <= er; i++) {
                System.out.print(matrix[i][ec] + " ");
            }

            // bottom
            for (int j = ec - 1; j >= sc; j--) {
                if (sc == ec) {
                    return;
                }
                System.out.print(matrix[er][j] + " ");
            }

            // left
            for (int i = er - 1; i >= sr + 1; i--) {
                System.out.print(matrix[i][sc] + " ");  // Fix: Change matrix[i][ec] to matrix[i][sc]
            }

            sr++;
            er--;
            sc++;
            ec--;

        }

    }
}

 */
