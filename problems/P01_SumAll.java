public class P01_SumAll {
    public static int sumAll(int[][] a) {
        int sum = 0;
        for (int[] row : a) {
            for (int val : row) {
                sum += val;
            }
        }
        
        return sum;
        
    }
}
