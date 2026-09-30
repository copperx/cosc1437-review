public class P03_RowSums {
    // Return a new array with the sum of each row of a.
    // rowSums({{1, 2, 3}, {4}, {}}) returns {6, 4, 0}
   public static int[] rowSums(int[][] a) {
    int[] result = new int[a.length];

    for (int i = 0; i < a.length; i++) {
        int currentSum = 0;
        for (int j = 0; j < a[i].length; j++){
        currentSum += a[i][j];

    }
    result[i] = currentSum;
   }
       return result;
    }
}
