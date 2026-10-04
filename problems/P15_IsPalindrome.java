public class P15_IsPalindrome {
    // Return true if s reads the same forwards and backwards.
    // isPalindrome("racecar") returns true, isPalindrome("abca") returns false
    public static boolean isPalindrome(String s) {
        if (s.length()%2 ==0) {
            if (s.length() == 0) {
                return true;
            } else {
                if (s.charAt(0) == s.charAt(s.length() - 1)) {
                    return isPalindrome(s.substring(1, s.length() - 1));
                }
            }
        } else {
            if (s.length() == 1) {
                return true;
            } else {
                if (s.charAt(0) == s.charAt(s.length() - 1)) {
                    return isPalindrome(s.substring(1, s.length() - 1));
                }  
            }
        }
        return false;
    }
}