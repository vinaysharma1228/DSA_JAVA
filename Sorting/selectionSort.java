
package Sorting;

/**
 * selectionSort
 */
public class selectionSort {

    public static void selection_sort(int arr[])
    {
        for(int i=0;i<arr.length-1;i++)
        {
            int minPos=i;

            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[j] < arr[minPos])
                {
                    minPos=j;
                }
            }

            int temp=arr[i];
            arr[i]=arr[minPos];
            arr[minPos]=temp;
        }
    }


    public static void printArray(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
      public static void main(String[] args) {

        int arr[]={5,4,1,3,2};
        selection_sort(arr);
        printArray(arr);
        
      }
}