package arrays;

public class binarySearchAlgorithm {

    // binary search applied only sorted Arrays

    public static int  binarySearch(int num[],int key)
    {
       int start=0,end=num.length-1;

       while (start<=end) {

        int mid=start+(end-start)/2;

        if(num[mid]==key)
        {
            return mid;
        }

        if(num[mid]>key)
        {
            end=mid-1;
        }
        else{
            start=mid+1;
        }

       }

       return -1;
        

    }
    public static void main(String[] args) {
        int num[]={2,4,6,8,10,12,13,17};

        int key=12;
    
        System.out.println("Index for value is : "+binarySearch(num, key));
        

    }
}
