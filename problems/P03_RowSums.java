public class P03_RowSums {
    // Return a new array with the sum of each row of a.
    // rowSums({{1, 2, 3}, {4}, {}}) returns {6, 4, 0}
    public static int[] rowSums(int[][] a) {
        int[] sums = new int[a.length];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                sums[i] += a[i][j];
            }
        }

        return sums;
    }
}
