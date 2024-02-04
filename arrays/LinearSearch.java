package arrays;

public class LinearSearch {

    public static boolean IsPresent(int num[],int key)
    {
        for(int i=0;i<num.length;i++)
        {
            if(num[i]==key)
            {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int num[]={2,4,6,8,10,12,13,17};

        int key=11; // not present
        // int key=10; //present

        if(IsPresent(num,key))
        {
            System.out.println("Element is present.");
        }
        else{
            System.out.println("Element is not present.");
        }


    }
}
