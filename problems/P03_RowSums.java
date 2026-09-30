public class P03_RowSums {
    // Return a new array with the sum of each row of a.
    // rowSums({{1, 2, 3}, {4}, {}}) returns {6, 4, 0}
    public static int[] rowSums(int[][] a) {
        int[] result = new int[a.length];
        int index = 0;
        for(int[] row : a) {
            int sum = 0;
            for(int value : row) {
                sum += value;
            }
            result[index] = sum;
            index++;
        }
        return result;
    }
}
