package arrays;

/**
 * searchInsertPosition
 */
public class searchInsertPosition {

    public static int findElementPosition(int nums[],int target)
    {
        int low=0,high=nums.length-1;

        while (low<=high) {

            int mid=low+(high-low)/2;

            if(nums[mid]==target)
            {
                return mid;
            }
            else if(nums[mid]<target)
            {
                low=mid+1;
            }
            else{
                high=mid-1;
            }
            
        }
        return low;
    }
    public static void main(String[] args) {
        int nums[]={1,3,5,6};
        int target=7;

       int ans= findElementPosition(nums, target);
       System.out.println("Element is at : "+ans+" position.");

    }
}