package arrays;

public class prefixSumOfSubArray {

    public static void findMaxMinSumOfSubArray(int num[])
    {
        int max=Integer.MIN_VALUE;
        int prefix[]=new int[num.length];

         prefix[0]=num[0];

        for(int i=1;i<num.length;i++)
        {

            prefix[i]=prefix[i-1]+num[i];

        }
        
      

        for(int i=0;i<num.length;i++)
        {
            for(int j=i;j<num.length;j++)
            {
                int sum=0;
               
                sum=(i==0)?prefix[j]:prefix[j]-prefix[i-1];

                max=Math.max(max, sum);
             
            }
            
        }

        System.out.println("Maximum sum is : "+max);
             
    }
    public static void main(String[] args) {
        int num[]={2,4,6,8,10};

        findMaxMinSumOfSubArray(num);
    }
}
