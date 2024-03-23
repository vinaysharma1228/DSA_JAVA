package Recursion;

public class SumOfNNaturalsNumber {

    public static int findSum(int n)
    {
        if(n==0)
        {
            return 0;
        }
        if(n==1)
        {
            return 1;
        }

        return n+findSum(n-1);
    }
    public static void main(String[] args) {
        int n=10;
        System.out.println(findSum(n));
    }
}
