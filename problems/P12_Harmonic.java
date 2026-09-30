public class P12_Harmonic {
    // Return 1 + 1/2 + 1/3 + ... + 1/n. n is at least 1.
    // harmonic(2) returns 1.5
    public static double harmonic(int n) {
        double sum = 0.0;

        for (int i = 1; i <= n; i++) {
            sum += 1.0 / i;
        }

        return sum;
    }
}
