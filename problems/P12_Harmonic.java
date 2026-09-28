public class P12_Harmonic {
    public static double harmonic(int n) {
        if (n == 1) {
            return 1.0;
        }
        return harmonic(n - 1) + 1.0 / n;
    }
}
