package methods_and_function;

public class checkEvenOrOdd {

    public static boolean IsEven(int num)
    {
        if(num%2==0)
        {
            return true;
        }

        return false;
    }
    public static void main(String[] args) {
        int num=10;

        if(IsEven(num))
        {
            System.out.println(num+ " is Even Number.");
        }
        else{
            System.out.println(num+ " is Odd Number.");
        }
    }
}
