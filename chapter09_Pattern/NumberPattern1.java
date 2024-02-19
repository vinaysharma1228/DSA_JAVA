package chapter09_Pattern;

public class NumberPattern1 {
    public static void main(String[] args) {
        int size = 4;

        // Loop through each row
        for (int i = 1; i <= 2 * size - 1; i++) {
            // Loop through each column
            for (int j = 1; j <= 2 * size - 1; j++) {
                // Find the minimum distance to the nearest edge
                int minDist = Math.min(i, j);
                minDist = Math.min(minDist, 2 * size - i);
                minDist = Math.min(minDist, 2 * size - j);

                // Print the number based on the minimum distance
                System.out.print(size - minDist + 1 + " ");
            }

            // Move to the next line after printing the row
            System.out.println();
        }
    }
}
