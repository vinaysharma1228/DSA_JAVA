package _2D_Array;

public class sumOfParticularRow {
    public static void main(String[] args) {
        int[][] nums = { {1,4,9},{11,4,3},{2,2,3} };

        int sum=0;

        // for(int i=0;i<nums.length;i++)
        // {
        //     for(int j=0;j<nums[0].length;j++)
        //     {
        //         if(i==1)
        //         {
        //             sum+=nums[i][j];
        //         }
        //     }
        // }

        for(int i=0;i<nums[0].length;i++)
        {
            sum+=nums[1][i];
        }

        System.out.println("Sum of Second Row : "+sum);
    }
}
