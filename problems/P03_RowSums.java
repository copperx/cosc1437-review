public class P03_RowSums {
    // Return a new array with the sum of each row of a.
    // rowSums({{1, 2, 3}, {4}, {}}) returns {6, 4, 0}
    public static int[] rowSums(int[][] a) {

       int[] sums = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            int sum = 0;
            for (int j = 0; j < a[i].length; j++) {
                sum += a[i][j];
            }
            sums[i] = sum;
        }
        return sums;
    }

    public static void main(String[] var0) {
      int[][] array = {{1, 2, 3}, {4}, {}};
      System.out.println(rowSums(array));
   }
}
