package Sorting;

public class allBasicSorting {
    
    
    public static void insertionSort(int arr[])
    {
        for(int i=1;i<arr.length;i++)
        {
            int cur=arr[i];
            int prev=i-1;
            
            while (prev >= 0 && arr[prev] > cur)
            {
                arr[prev+1]=arr[prev];
                prev--;
            }
            
            arr[prev+1]=cur;
        }
    }
    
    public static void selectionSort(int arr[])
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
    
    public static void bubbleSort(int arr[])
    {
        
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=0;j<arr.length-1-i;j++)
            {
                if(arr[j] > arr[j+1])
                {
                    int tmp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=tmp;
                }
            }
        }
    }
    
    public static void printArray(int arr[])
    {
        System.out.print("Sorted Array : ");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        
         System.out.println();
    }
    
    public static void main(String[] args) {
        int arr[]={5,4,1,3,2};
        
       // bubbleSort(arr);
       // selectionSort(arr);
        insertionSort(arr);
        printArray(arr);
    }
}

