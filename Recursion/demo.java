package Recursion;

public class demo {

    public static void print(int x)
    {
        if(x==5)
        {
            return;
        }
        System.out.println("Call for : "+x);
        print(x+1);
    }
    public static void main(String[] args) {
        print(1);
    }
}
