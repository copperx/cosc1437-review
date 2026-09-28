public class P01_SumAll {
    // Return the sum of all the numbers in a. Rows can have different lengths.
    // sumAll({{1, 2}, {3}}) returns 6
    public static int sumAll(int[][] a) {
        int sum = 0;
        for(int row = 0; row < a.length; row++){
            for(int col = 0; col < a[row].length; col++){
                sum += a[row][col];
            }
        }
        return sum;
    }
}
