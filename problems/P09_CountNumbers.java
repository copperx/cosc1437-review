public class P09_CountNumbers {
    // Return how many items Integer.parseInt can convert without an exception.
    // countNumbers({"12", "abc", "-5", "3.5"}) returns 2
    public static int countNumbers(String[] items) {
        int n = 0;
        for (int i = 0; i < items.length; i++) {
            int x = Integer.parseInt(items[i]);
            if (x == (int)x) {
                n++;
            }
        }
        return n;
    }
}