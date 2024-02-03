package methods_and_function;

public class callByReference {

    public static void swap(int num[])
    {
        int temp=num[0];
        num[0]=num[1];
        num[1]=temp;

    }
    public static void main(String[] args) {
        int a=10;
        int b=20;

        int num[]={a,b};

        swap(num);

        System.out.println("a = "+num[0]);
        System.out.println("b = "+num[1]);
    }
}
