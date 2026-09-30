public class P14_Reverse {
    // Return s backwards.
    // reverse("cat") returns "tac"
    public static String reverse(String s) {
        if (s == null || s.length() <= 1) {
            return s;
        }
        return reverse(s.substring(1)) + s.charAt(0);
    }
}