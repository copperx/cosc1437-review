public class P11_SumOfSquares {
    public static int sumOfSquares(int n) {
        if (n == 0) {
            return 0;
        }
        return sumOfSquares(n - 1) + n * n;
    }
}
