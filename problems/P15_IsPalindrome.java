public class P15_IsPalindrome {
    // Return true if s reads the same forwards and backwards.
    // isPalindrome("racecar") returns true, isPalindrome("abca") returns false
    public static boolean isPalindrome(String s) {
        boolean ans = false;
        if (s.length() == 0) {

        } else {
            if (s.charAt(0) == s.charAt(s.length() - 1)) {
                ans = true;
            }
            isPalindrome(s.substring(0 + 1, s.length() - 1));
        }
        return ans;
    }
}