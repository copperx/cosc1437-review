public class P02_MaxValue {
    // Return the largest value in a. a has at least one value, and rows can have different lengths.
    // maxValue({{-3.5, -0.01}, {-7.0}}) returns -0.01
    public static double maxValue(double[][] a) {
        double max = a[1][1];
        for(int i = 0; i < a.length; i++) {
            for(int j = 0; j < a[i].length; j++) {
                if(value > max) {
                    max = value;
                }
            }
        }
        return max;
    }
}
