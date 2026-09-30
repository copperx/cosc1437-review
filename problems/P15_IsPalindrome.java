public class P15_IsPalindrome {
    // Return true if s reads the same forwards and backwards.
    // isPalindrome("racecar") returns true, isPalindrome("abca") returns false
    public static boolean isPalindrome(String s) {
        if (s == null) {
            return false;
        }
   
        if (s.length() <= 1) {
            return true;
        }

        if (s.charAt(0) != s.charAt(s.length() - 1)) {
            return false;
        }

        return isPalindrome(s.substring(1, s.length() - 1));
    }
}