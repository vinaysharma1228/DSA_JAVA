package BitManipulation;

public class swapNUmber {
    public static void main(String[] args) {
        int a=10,b=5;
        System.out.println("before swapping\na="+a+"\n"+"b="+b);

        a=a^b;
        b=a^b;
        a=a^b;

        System.out.println("After swapping\na="+a+"\n"+"b="+b);
    }
}
