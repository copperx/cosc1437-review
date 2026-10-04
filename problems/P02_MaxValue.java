public class P02_MaxValue {
    // Return the largest value in a. a has at least one value, and rows can have different lengths.
    // maxValue({{-3.5, -0.01}, {-7.0}}) returns -0.01
    public static double maxValue(double[][] a) {
        double largeValue = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (largeValue < a[i][j]) {
                    largeValue = a[i][j];
                }
            }
        }
        return largeValue;
    }
}
