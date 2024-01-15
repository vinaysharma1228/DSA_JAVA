package chapter02;
import java.util.*;
public class reverse_string {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string to reverse it->: ");
        String str=sc.nextLine();

        String nstr="";
        char ch;

        for(int i=0;i<str.length();i++)
        {
            ch=str.charAt(i);
            nstr=ch+nstr;
        }

        System.out.println("Reversed String : "+nstr);


        sc.close();
    }
    
}
