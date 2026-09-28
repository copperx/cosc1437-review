public class P02_MaxValue {
    // Return the largest value in a. a has at least one value, and rows can have different lengths.
    // maxValue({{-3.5, -0.01}, {-7.0}}) returns -0.01
    public static double maxValue(double[][] a) {
        double largest = a[0][0];
        for(int row = 0; row < a.length; row++){
            for(int col = 0; col < a[row].length; col++){
                if(a[row][col] > largest){
                    largest = a[row][col];
                }
            }
        }
        return largest;
    }
}
