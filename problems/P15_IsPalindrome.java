public class P15_IsPalindrome {
    // Return true if s reads the same forwards and backwards.
    // isPalindrome("racecar") returns true, isPalindrome("abca") returns false
    public static boolean isPalindrome(String s) {
        if (s == null || s.length() <= 1) {
            return true;
        }
        char first = Character.toLowerCase(s.charAt(0));
        char last = Character.toLowerCase(s.charAt(s.length() - 1));
        
        if (first != last) {
            return false;
        }
        return isPalindrome(s.substring(1, s.length() - 1));
    }
}

public static void main(String [] args){
    String s = "cocacola";
    System.out.println(isPalindrome(s));
}

