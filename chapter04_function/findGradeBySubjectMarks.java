package chapter04_function;

import java.util.Scanner;

public class findGradeBySubjectMarks {

    public static String findGrade(int marks)
    {
        if(marks<=100 && marks>90)
        {
            return "AA";
        }
        else if(marks<=90 && marks>80)
        {
            return "AB";

        }
        else if(marks<=80 && marks>70)
        {
            return "BB";

        }
        else if(marks<=70 && marks>60)
        {
            return "BC";

        }
        else if(marks<=60 && marks>50)
        {
            return "CD";

        }
        else if(marks<=50 && marks>40)
        {
            return "DD";

        }

        return "FAIL";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your marks ( 1 to 100 ): ");
        int marks=sc.nextInt();
        sc.close();


        System.out.println("Your Grade : "+findGrade(marks));
    }
}
