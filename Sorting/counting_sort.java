package Sorting;

public class counting_sort {

    public static void countingSort(int arr[])
    {
        int largest=Integer.MIN_VALUE;

        // finding largest value from the array 
        for(int i=0;i<arr.length;i++)

        {
            largest=Math.max(largest, arr[i]);
        }

        int countArray[]=new int[largest+1];

        // storing frequency...

        for(int i=0;i<arr.length;i++)
        {
            countArray[arr[i]]++;
        }

        // sorting logic....

        int j=0;
        for(int i=0;i<countArray.length;i++)
        {
            while (countArray[i] > 0) {
                arr[j]=i;
                j++;
                countArray[i]--;
                
            }
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
        countingSort(arr);
        printArray(arr);


    }
}
