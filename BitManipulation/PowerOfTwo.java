
package BitManipulation;

/**
 * PowerOfTwo
 */
public class PowerOfTwo {

    public static boolean checkPowerOfTwo(int n)
    {
        if (n<=0) {
            return false;         
        }
        return (n & n-1 )==0;
    }

    public static void main(String[] args) {
        int n=0;

        System.out.println(checkPowerOfTwo(n));
    }
}