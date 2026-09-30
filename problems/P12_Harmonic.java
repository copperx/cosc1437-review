public class P12_Harmonic {
    // Return 1 + 1/2 + 1/3 + ... + 1/n. n is at least 1.
    // harmonic(2) returns 1.5
    public static double harmonic(int n) {
        if (n <= 1) {
            return 1.0; 
        }
        return (1.0 / n) + harmonic(n - 1); 
    }
}