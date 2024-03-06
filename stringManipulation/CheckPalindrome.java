package stringManipulation;

public class CheckPalindrome {

    public static boolean twoPointer(String str)
    {
        int start=0;
        int end=str.length()-1;

        while (start <= end) {

            if(str.charAt(start) != str.charAt(end))
            {
                return false;
            }

            start++;
            end--;
            
        }
        return true;
    }

    public static boolean IsPalindrome(String str)
    {
        for(int i=0;i<str.length()/2;i++)
        {
            if(str.charAt(i) != str.charAt(str.length()-1-i))
            {
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args) {
        String str="vinayyaniv";


        if(twoPointer(str))
        {
            System.out.println("Given string is  palindrome.");
        }
        else{
            System.out.println("Given string is not palindrome.");

        }
    }
}
