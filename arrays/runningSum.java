
package arrays;

/**
 * runningSum
 */
public class runningSum {

    public int[] runningSumm(int[] nums) {
        int size=nums.length;
        int runningSum[]=new int[size];

        int sum=nums[0];
        for(int i=0;i<nums.length;i++)
        {
           runningSum[i]=sum;
           if(i<size-1)
           {
              sum+=nums[i+1];
           }

        }
        return runningSum;
    }

    public static void main(String[] args) {

        //leetcode 
        
    }
}