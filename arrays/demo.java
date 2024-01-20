package arrays;

import java.util.ArrayList;
import java.util.List;

public class demo {
    public static void main(String[] args) {

        int nums[]={0,1,2,3,4};
        int index[]={0,1,2,2,1};
        

         List<Integer> targetList = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            targetList.add(index[i], nums[i]);
        }

        System.out.println(targetList);
    }
}
