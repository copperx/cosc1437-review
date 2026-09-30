public class P14_Reverse {
    // Return s backwards.
    // reverse("cat") returns "tac"
    public static String reverse(String s) {
        String b = "";
        if (s.length() == 0) {

        } else {
            b = b.append(s.charAt(s.length() - 1));
            reverse(s.substring(0, s.length() - 1));
        }
        return b;
    }
}
