import java.util.*;
public class enter_x_to_stop {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int sum=0;

        System.out.println("Enter numbers (enter 'x' to stop):");

        while (true) {
            String number=sc.nextLine();

            if(number.equals("x"))
            {
                break;
            }
            try{
                int num=Integer.parseInt(number);
                sum+=num;
            }
            catch (Exception e){
                System.out.println("Please enter valid number or x to stop.");

            }
        }
        System.out.println("Sum: "+sum);

        sc.close();
    }
    
}
