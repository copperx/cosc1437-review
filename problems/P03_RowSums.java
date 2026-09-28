public class P03_RowSums {
    public static int[] rowSums(int[][] a) {
        int[] sums = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            for (int x : a[i]) {
                sums[i] += x;
            }
        }
        return sums;
    }
}
