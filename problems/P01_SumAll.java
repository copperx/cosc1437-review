public class P01_SumAll {
     //Return the sum of all the numbers in a. Rows can have different lengths.
    // sumAll({{1, 2}, {3}}) returns 6
   // public static int sumAll(int[][] a) {
   public static int sumAll(int[][] a) {
    int sum = 0;

    for (int i = 0; i < a.length; i++){
        for (int j = 0; j <a[i].length; j++){
            sum += a[i][j];
    }
    }
        return sum;
    }
}
