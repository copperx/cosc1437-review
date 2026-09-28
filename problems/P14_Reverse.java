public class P14_Reverse {
    // Return s backwards.
    // reverse("cat") returns "tac"
    public static String reverse(String s) {

        if(s.equals("")){
            return "";
        }

        String reversed = reverse(s.substring(1,s.length()));

        return reversed + s.charAt(0);



    }
}
