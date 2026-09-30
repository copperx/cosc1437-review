public class P11_SumOfSquares {
    // Return 1*1 + 2*2 + ... + n*n. Return 0 if n is 0.
    // sumOfSquares(3) returns 14
    public static int sumOfSquares(int n) {
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i * i;
        }

        return sum;
    }
}
