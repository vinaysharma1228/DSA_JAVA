package methods_and_function;

/**
 * binaryToDecimal
 */
public class binaryToDecimal {

    

    public static int ConvertBinaryToDecimal(int bin)
    {
        int decimal=0;
        int pow=0;

        while (bin!=0) {
            
            int ld=bin%10;
            decimal=decimal+ld*(int)Math.pow(2, pow);
            pow++;
            bin=bin/10;
        }




        return decimal;
    }

    public static void main(String[] args) {
        
        int bin=1010;

        System.out.println("Binary To Decimal : "+ConvertBinaryToDecimal(bin));
    }
}