package chapter09_Pattern;

public class NumberPattern4 {
    public static void main(String[] args) {
        int size = 4;

        // Initialize a counter for the numbers
        int num = 1;

        // Loop through each row
        for (int i = 1; i <= size; i++) {
            // Print leading spaces
            for (int j = 1; j < i; j++) {
                System.out.print("   ");
            }

            // Loop through each column
            for (int j = i; j <= size; j++) {
                System.out.print(num++ + " ");
            }

            // Loop through each column for the second half
            for (int j = size - 1; j >= i; j--) {
                System.out.print(num++ + " ");
            }

            // Move to the next line after printing the row
            System.out.println();
        }
    }
}
