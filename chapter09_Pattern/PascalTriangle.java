
package chapter09_Pattern;

public class PascalTriangle {
    public static void main(String[] args) {
        int numRows = 7; // You can change this to print more or fewer rows

        for (int i = 0; i < numRows; i++) {
            // Add spaces before each line to create a pyramid shape
            for (int j = 0; j < numRows - i; j++) {
                System.out.print("  ");
            }

            for (int j = 0; j <= i; j++) {
                System.out.print(binomialCoefficient(i, j) + "   ");
            }

            System.out.println();
        }
    }

    // Function to calculate the binomial coefficient C(n, k)
    private static int binomialCoefficient(int n, int k) {
        if (k == 0 || k == n) {
            return 1;
        } else {
            return binomialCoefficient(n - 1, k - 1) + binomialCoefficient(n - 1, k);
        }
    }
}
