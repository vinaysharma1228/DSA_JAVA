package methods_and_function;

public class sum_of_digit {

    public static void findSumOfDigit(int num)
    {
        int sum=0;

        while (num>0) {
            int ld=num%10;
            sum+=ld;

            num/=10;
            
        }
        System.out.println("Sum of digit: "+sum);
    }
    public static void main(String[] args) {
        int num=12345;

        findSumOfDigit(num);
    }
}
