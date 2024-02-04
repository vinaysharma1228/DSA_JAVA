package arrays;

public class ReverseArray {

    
    public static void reverse(int nums[])
    {
        int start=0, end= nums.length-1;

        while (start<end) {
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;

            start++;
            end--;    
        }
    }
    public static void main(String[] args) {
        int nums[]={2,3,8,10};
        reverse(nums);

        for(int i=0;i<nums.length;i++)
        {
            System.out.print(nums[i]+" ");
        }

    }
}
