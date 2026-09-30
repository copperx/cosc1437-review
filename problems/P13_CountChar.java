public class P13_CountChar {
    // Return how many times c appears in s.
    // countChar("banana", 'a') returns 3
    public static int countChar(String s, char c) {
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                count++;
            }
        }

        return count;
    }
}