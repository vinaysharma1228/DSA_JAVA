package arrays;

class oddCells {
    public int oddCell(int m, int n, int[][] indices) {
        int[] rowCounts = new int[m];
        int[] colCounts = new int[n];

        // Increment counts based on indices
        for (int[] index : indices) {
            rowCounts[index[0]]++;
            colCounts[index[1]]++;
        }

        int oddCount = 0;

        // Count odd values in the matrix
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int value = rowCounts[i] + colCounts[j];
                if (value % 2 == 1) {
                    oddCount++;
                }
            }
        }

        return oddCount;
    }
}

