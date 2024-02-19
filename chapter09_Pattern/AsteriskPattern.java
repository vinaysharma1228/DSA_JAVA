package chapter09_Pattern;

public class AsteriskPattern {
    public static void main(String[] args) {
        int numRows = 3;

        // Loop through each row
        for (int i = 0; i < numRows; i++) {
            // Print leading spaces
            for (int j = 0; j < 2 * (numRows - i - 1); j++) {
                System.out.print(" ");
            }

            // Print asterisk for the left side
            System.out.print("*");

            // Print spaces between the asterisks
            for (int k = 0; k < 2 * i; k++) {
                System.out.print(" ");
            }

            // Print asterisk for the right side
            System.out.print("*");

            // Move to the next line after printing the row
            System.out.println();
        }
    }
}
