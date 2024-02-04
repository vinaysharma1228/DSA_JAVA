package arrays;

public class sum_of_subArray {

    public static void findMaxMinSumOfSubArray(int num[])
    {
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;

        for(int i=0;i<num.length;i++)
        {
            for(int j=i;j<num.length;j++)
            {
                int sum=0;
                for(int k=i;k<=j;k++)
                {
                    System.out.print(num[k]+" ");
                    sum+=num[k];
                    
                }
                System.out.print("  sum= "+sum);

                max=Math.max(max, sum);
                min=Math.min(min, sum);
                
                System.out.println();
            }
            System.out.println();
        }

        System.out.println("Maximum sum is : "+max);
        System.out.println("Minimum sum is : "+min);
        
    }
    public static void main(String[] args) {
        int num[]={2,4,6,8,10};

        findMaxMinSumOfSubArray(num);
    }
}
