package methods_and_function;

public class AverageOfThreeNumber {

    public static void findAverageOfThreeNumber(int a,int b,int c)
    {
        double avg=(a+b+c)/3;

        System.out.println("Average of Three Numbers : "+(avg));
        
    }
    public static void main(String[] args) {
        int a=10;
        int b=20;
        int c=30;

        findAverageOfThreeNumber(a,b,c);
    }
}
