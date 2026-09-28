public class P11_SumOfSquares {
    // Return 1*1 + 2*2 + ... + n*n. Return 0 if n is 0.
    // sumOfSquares(3) returns 14
    public static int sumOfSquares(int n) {
        if(n==0){
            return 0;
        }
        return n * n + sumOfSquares(n-1);
    }
}
