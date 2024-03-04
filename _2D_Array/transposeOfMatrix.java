package _2D_Array;

public class transposeOfMatrix {
    public static void main(String[] args) {
        int[][] nums = { {1,4,9},{11,4,3},{2,2,3} };

        System.out.println("Original Matrix:-");

        for(int i=0;i<nums.length;i++)
        {
            for(int j=0;j<nums[0].length;j++)
            {
                System.out.print(nums[i][j]+" ");

            }
            System.out.println();
        }
        System.out.println();

        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums[0].length;j++)
            {
                int temp=nums[i][j];
                nums[i][j]=nums[j][i];
                nums[j][i]=temp;

            }
        }

        

        System.out.println("Transpose Matrix:-");

        for(int i=0;i<nums.length;i++)
        {
            for(int j=0;j<nums[0].length;j++)
            {
                System.out.print(nums[i][j]+" ");

            }
            System.out.println();
        }
    }
}
