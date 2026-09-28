public class P03_RowSums {
    // Return a new array with the sum of each row of a.
    // rowSums({{1, 2, 3}, {4}, {}}) returns {6, 4, 0}
    public static int[] rowSums(int[][] a) {
        int newlength = 0;
        for(int row = 0; row < a.length; row++){
            newlength += 1;
        }

        int[] sums = new int[newlength];

        for(int row = 0; row < a.length; row++){
            for(int col = 0; col < a[row].length; col++){
                sums[row] += a[row][col];
            }
        }

        return sums;

    }
}
