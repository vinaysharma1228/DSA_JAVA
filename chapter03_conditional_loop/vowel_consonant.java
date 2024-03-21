package chapter03_conditional_loop;

import java.util.Scanner;

public class vowel_consonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter letter to check vowel or Consonant: ");
        char ch=sc.next().charAt(0);

        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U' )
        {

            System.out.println(ch +" is Vowel letter.");
        }
        else{
            System.out.println(ch+" is Consonant letter.");
        }
      sc.close();
    }
}
