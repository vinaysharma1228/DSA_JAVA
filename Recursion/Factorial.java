package Recursion;

public class Factorial {

    public static int findFactorial(int n)
    {
        if(n==0 || n==1)
        {
            return 1;
        }
        return n * findFactorial(n-1);
    }
    public static void main(String[] args) {
        int n=5;
        System.out.println(findFactorial(n));

    }
}
