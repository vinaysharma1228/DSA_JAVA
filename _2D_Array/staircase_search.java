package _2D_Array;

import java.util.ArrayList;

public class staircase_search {

    public static void stairCaseSearch2(int matrix[][],int key)
    {
        ArrayList<Integer> path =new ArrayList<>();
        int row=matrix.length-1,col=0;

        while (row >=0 && col < matrix[0].length) {
            path.add(matrix[row][col]);
            if(matrix[row][col]==key)
            {
                System.out.println("Found key at ("+row+","+col+") Position.");
                System.out.println("Path:-"+path);
                return;
            }
            else if (key < matrix[row][col])
            {
                row--;
            }
            else
            {
                col++;
            }

           
        }

       

        System.out.println("Key doesn't exist in this matrix.");
    }
    
    public static void stairCaseSearch(int matrix[][],int key)
    {
        int row=0,col=matrix[0].length-1;
        ArrayList<Integer> path =new ArrayList<>();


        while (row < matrix.length && col >=0) {
            path.add(matrix[row][col]);

            if(matrix[row][col]==key)
            {
                System.out.println("Found key at ("+row+","+col+") Position.");
                System.out.println("Path:-"+path);
                return;
            }

            else if(key < matrix[row][col])
            {
                col--;
            }
            else{
                row++;
            }
            
        }

        System.out.println("Key doesn't exist in this matrix.");

    }
    
    public static void main(String[] args) {
        int matrix[][]={{10,20,30,40},
                        {15,25,35,45},
                        {27,29,37,48},
                        {32,33,39,50}};

        int key=40;

      //  stairCaseSearch(matrix, key);
      stairCaseSearch2(matrix, key);

    }
}
