public class P02_MaxValue {
    public static double maxValue(double[][] a) {
        double max = a[0][0];
        for (int i = 0; i < a.length; i++) { 
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] > max) {
                    max = a[i][j];
                }
            }
        }
        return max;
    }
}
