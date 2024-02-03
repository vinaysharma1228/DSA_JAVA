package character_pattern;

import java.util.Scanner;

public class continous_character_pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char ch='A';

        for(int i=1;i<=4;i++)
        {
            for(int j=1;j<=i;j++){
                System.out.print(ch+" ");
                ch++;
            }
            System.out.println();
        }

        sc.close();
    }
}
