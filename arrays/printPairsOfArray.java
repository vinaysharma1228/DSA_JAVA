package arrays;

public class printPairsOfArray {

    public static void printPairs(int nums[])
    {

        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                System.out.print("("+nums[i]+","+nums[j]+")");
            }
            System.out.println();
        }



    }
    public static void main(String[] args) {
        int nums[]={2,4,6,8,9,7};

        printPairs(nums);

    }
}
