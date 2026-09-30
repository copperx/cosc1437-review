public class P14_Reverse {
    // Return s backwards.
    // reverse("cat") returns "tac"
    public static String reverse(String s) {
        if (s == null) 
        {
            return null;
        }
        return new StringBuilder(s).reverse().toString();
    }
}
