public class P02_MaxValue {
    public static double maxValue(double[][] a) {
        double max = a[0][0];
        for (double[] row : a) {
            for (double x : row) {
                if (x > max) {
                    max = x;
                }
            }
        }
        return max;
    }
}
