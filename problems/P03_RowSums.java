public class P03_RowSums {
    // Return a new array with the sum of each row of a.
    // rowSums({{1, 2, 3}, {4}, {}}) returns {6, 4, 0}
    public static int[] rowSums(int[][] a) {
        int sumarray[] = new int[a.length];
        int sum = 0;
        int i = 0;
        for (int [] row: a){
            for(int value: row){
                sum+=value;
                sumarray[i] = sum;
            }
            i++;
            sum=0;
        }
        return sumarray;
    }
}
