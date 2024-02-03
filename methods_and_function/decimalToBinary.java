package methods_and_function;

public class decimalToBinary {

    public static void ConvertDecimalToBinary(int dec) {
        int bin = 0;
        int pow = 0;

        while (dec > 0) {
            int rem = dec % 2;
            bin = bin + rem * (int)Math.pow(10, pow);
            pow++;
            dec /= 2;
        }

        System.out.println("Binary Number : " + bin);
    }

    public static void main(String[] args) {
        int dec = 7;
        ConvertDecimalToBinary(dec);
    }
}
