public class P07_ParseOrDefault {
    // Return s converted with Integer.parseInt. If s is not a valid int, return fallback.
    // parseOrDefault("42", 0) returns 42, parseOrDefault("4x2", -1) returns -1
    public static int parseOrDefault(String s, int fallback) {
        try {
            int x = Integer.parseInt(s);
            return Integer.parseInt(s);
        } catch (NumberFormatException e) {
            return fallback;
        }
        
        
    }
}
