public class P13_CountChar {
    public static int countChar(String s, char c) {
        if (s == null || s.isEmpty()) {
            return 0;
        }
        int match = (s.charAt(0) == c) ? 1 : 0;
        return match + countChar(s.substring(1), c);
    }
}