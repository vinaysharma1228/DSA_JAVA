package Sorting;

import java.util.Arrays;
import java.util.Collections;

public class inbuiltSort {

    public static void printArray(Integer arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Integer arr[]={5,4,1,3,2};
       // Arrays.sort(arr); //TC - O(nlogn)

       // we can also sort particular part of array by just giving si and ei

     //  Arrays.sort(arr,0,2);  // here 2 is not included.. it will sort 0 to 1

     Arrays.sort(arr,Collections.reverseOrder());
        printArray(arr);

    }
}
