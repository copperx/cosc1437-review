public class P14_Reverse {
    public static String reverse(String s) {
        if (s.equals("")) {
            return "";
        }
        return reverse(s.substring(1)) + s.charAt(0);
    }
}
