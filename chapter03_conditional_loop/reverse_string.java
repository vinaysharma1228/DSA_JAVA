package chapter03_conditional_loop;

import java.util.Scanner;

public class reverse_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String : ");
        String str=sc.nextLine();

        String nstr="";
        char ch;

        for(int i=0;i<str.length();i++)
        {
            ch=str.charAt(i);
            nstr=ch+nstr;
        }

        System.out.println("Reversed string : "+nstr);

        sc.close();

    }
}
