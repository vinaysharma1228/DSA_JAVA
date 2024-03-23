package Recursion;

public class n_naturalNumbers {

    public static void printNnaturalNumber(int x,int n)
    {
        if(x==n+1)

        {
            return;
        }

        System.out.print(x+" ");
        printNnaturalNumber(x+1, n);
    }
    public static void main(String[] args) {
        int n=10;

        printNnaturalNumber(1,n);
    }
}
