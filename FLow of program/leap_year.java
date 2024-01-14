
import java.util.Scanner;

public class leap_year {

    static boolean IsLeapYear (int year)
    {

        if(year%4==0)
        {
            return true;
        }

        return false;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter year : ");
        int year=sc.nextInt();


        if(IsLeapYear(year))
        {
            System.out.println("Leap year.");

        }
        else{
            System.out.println(" Not Leap year.");
 
        }
        
        sc.close();
        
    }
}