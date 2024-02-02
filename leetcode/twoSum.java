package leetcode;

import java.util.HashMap;
import java.util.Scanner;

public class twoSum {

    public static int[] findTwoSum(int[] nums,int target)
    {

       HashMap<Integer,Integer> map=new HashMap<>();

       for(int i=0;i<nums.length;i++)
       {
         map.put(nums[i], i);
       }

       for(int i=0;i<nums.length;i++)
       {
           int remaining = target-nums[i];
           
           if(map.containsKey(remaining) && map.get(remaining)!=i)
           {
              return new int[]{i,map.get(remaining)};
           }
       }
        
       
     return new int[]{};


    } 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] nums={2,7,11,15};
        int target=9;

        int[] result = findTwoSum(nums, target);

        if(result.length==0)
        {
            System.out.println("No solution exists");
        }
       
        for(int i=0;i<result.length;i++)
        {
            System.out.print(result[i]+" ");
        }

        sc.close();
    }
}
