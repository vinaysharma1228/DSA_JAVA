package chapter02;

import java.util.*;

public class greeting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name=sc.nextLine();

        System.out.println("Hello "+name);

        sc.close();
    }
}
