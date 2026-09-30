public class P03_RowSums {
    public static int[] rowSums(int[][] a) {
        int[] sums = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            int currentSum = 0;
            for (int j = 0; j < a[i].length; j++) {
                currentSum += a[i][j];
            }
            sums[i] = currentSum;
        }
        return sums;
    }
}
