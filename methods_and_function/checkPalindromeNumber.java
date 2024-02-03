package methods_and_function;



public class checkPalindromeNumber {

    public static boolean IsPalindrome(int num)
    {
        int rev=0;
        int originalNum=num;

        while (num!=0) {
            int ld=num%10;
            rev=(rev*10)+ld;

            num=num/10;
        }

        if (rev==originalNum) {
            
            return true;
        }

        return false;
    }
    public static void main(String[] args) {

        int num=12321;

        if(IsPalindrome(num))
        {
            System.out.println(num + " is Palindrome Number .");
        }
        else{
            System.out.println(num + " is Not Palindrome Number .");
        }
        
    }
}
