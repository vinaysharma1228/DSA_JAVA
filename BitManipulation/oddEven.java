package BitManipulation;

public class oddEven {
    public static void main(String[] args) {
        int num=8;

        int bitMask=1;

        if ((num & bitMask) == 0)
        {
            System.out.println("Even");
        }
        else{
            System.out.println("odd");
        }
    }
}
