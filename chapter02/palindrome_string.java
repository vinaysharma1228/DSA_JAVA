package chapter02;

import java.util.Scanner;

public class palindrome_string {
     public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string to check palindrome : ");
        String str=sc.nextLine();

        String nstr="";
        char ch;

        for(int i=0;i<str.length();i++)
        {
            ch=str.charAt(i);
            nstr=ch+nstr;
        }

        
        if(str.equals(nstr))
        {
            System.out.println(str+" is palindrome String.");
        }

        else{
            System.out.println(str+" is not palindrome String.");

        }


        sc.close();
    }
    
}
