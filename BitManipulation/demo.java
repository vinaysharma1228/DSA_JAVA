package BitManipulation;

public class demo {
    public static void main(String[] args) {
      int x=10;
      int y=5;

      System.out.println("Before swapping is: x"+x+" and y is : "+y);

      x=x^y;
      y=x^y;
      x=x^y;

      System.out.println("After swapping is: x "+x+" and y is : "+y);


    }
}
