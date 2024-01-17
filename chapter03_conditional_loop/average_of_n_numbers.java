package chapter03_conditional_loop;

import java.util.Scanner;

public class average_of_n_numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a n terms : ");
        int n=sc.nextInt();

        double sum=(n*(n+1)/2);
        double avg=(sum/n);
        System.out.println(sum);
        System.out.println(avg);

        sc.close();
    }
}
