package arrays;

import java.util.Arrays;

public class smallerNumbersThanCurrent {
    public int[] smallerNumbersThanCurrent1(int[] nums) {
    int n = nums.length;

    // Create a copy of the original array along with its indices
    int[][] pairs = new int[n][2];
    for (int i = 0; i < n; i++) {
        pairs[i][0] = nums[i];
        pairs[i][1] = i;
    }

    // Sort the array based on the values
    Arrays.sort(pairs, (a, b) -> Integer.compare(a[0], b[0]));

    int[] result = new int[n];
    int count = 0;

    for (int i = 0; i < n; i++) {
        // Update the result using the index from the sorted array
        result[pairs[i][1]] = count;

        // Increment count for duplicate values
        if (i > 0 && pairs[i][0] == pairs[i - 1][0]) {
            count++;
        } else {
            count = i + 1;
        }
    }

    return result;
}

  public static void main(String[] args) {
    
  }
}

/*
 * 
 *
 * efficient and 0(n)
 *  class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] storage = new int[101];
        for(int i = 0; i < nums.length; storage[nums[i++]]++);
        for(int i = 1; i < 101; storage[i] += storage[i++ - 1]);
        for(int i = 0; i < nums.length; nums[i] = ((nums[i] == 0) ? 0 : storage[nums[i] - 1]), i++);
        return nums;
    }
}
 * 
 */
