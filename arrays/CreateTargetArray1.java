package arrays;


import java.util.ArrayList;
import java.util.List;

public class CreateTargetArray1 {
    public static int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> targetList = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            targetList.add(index[i], nums[i]);
        }

        int[] targetArray = new int[targetList.size()];
        for (int i = 0; i < targetList.size(); i++) {
            targetArray[i] = targetList.get(i);
        }

        return targetArray;
    }

    public static void main(String[] args) {
        // Example 1
        int[] nums1 = {0, 1, 2, 3, 4};
        int[] index1 = {0, 1, 2, 2, 1};
        int[] result1 = createTargetArray(nums1, index1);
        System.out.println("Example 1: " + java.util.Arrays.toString(result1));

        // Example 2
        int[] nums2 = {1, 2, 3, 4, 0};
        int[] index2 = {0, 1, 2, 3, 0};
        int[] result2 = createTargetArray(nums2, index2);
        System.out.println("Example 2: " + java.util.Arrays.toString(result2));

        // Example 3
        int[] nums3 = {1};
        int[] index3 = {0};
        int[] result3 = createTargetArray(nums3, index3);
        System.out.println("Example 3: " + java.util.Arrays.toString(result3));
    }
}


// /**
//  * CreateTargetArray1
//  */
// public class CreateTargetArray1 {
//     public static int[] createTargetArray(int[] nums, int[] index) {
//         for (int i = 0; i < nums.length; i++) {
//             int currIndex = index[i];

//             // Shift elements to make space for the new element
//             for (int j = i; j > currIndex; j--) {
//                 nums[j] = nums[j - 1];
//             }

//             // Insert the new element at the correct index
//             nums[currIndex] = nums[i];
//         }

//         // Trim the array to the correct size
//         int[] targetArray = new int[nums.length];
//         System.arraycopy(nums, 0, targetArray, 0, nums.length);

//         return targetArray;
//     }

//     public static void main(String[] args) {
//         // Example 1
//         int[] nums1 = {0, 1, 2, 3, 4};
//         int[] index1 = {0, 1, 2, 2, 1};
//         int[] result1 = createTargetArray(nums1, index1);
//         System.out.println("Example 1: " + java.util.Arrays.toString(result1));

//         // Example 2
//         int[] nums2 = {1, 2, 3, 4, 0};
//         int[] index2 = {0, 1, 2, 3, 0};
//         int[] result2 = createTargetArray(nums2, index2);
//         System.out.println("Example 2: " + java.util.Arrays.toString(result2));

//         // Example 3
//         int[] nums3 = {1};
//         int[] index3 = {0};
//         int[] result3 = createTargetArray(nums3, index3);
//         System.out.println("Example 3: " + java.util.Arrays.toString(result3));
//     }
// }


// /*
//  * 
//  * class Solution {
//     public int[] createTargetArray(int[] nums, int[] index) {
        
//         List<Integer> targetList = new ArrayList<>();

//         for (int i = 0; i < nums.length; i++) {
//             targetList.add(index[i], nums[i]);
//         }

//         int[] targetArray = new int[targetList.size()];
//         for (int i = 0; i < targetList.size(); i++) {
//             targetArray[i] = targetList.get(i);
//         }

//         return targetArray;


//     }
// }
//  */
