public class P07_ParseOrDefault {

    public static int parseOrDefault(String s, int fallback) {
        if (s == null) {
            return fallback;
        }
        try {
            return Integer.parseInt(s);
        } catch (NumberFormatException e) {
            return fallback;
        }
    }
}