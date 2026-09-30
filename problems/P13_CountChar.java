public class P13_CountChar {
    // Return how many times c appears in s.
    // countChar("banana", 'a') returns 3
    public static int countChar(String s, char c) {
        int count = 0;
        this.s = s;
        this.c = c;
        for(int i = 0; i < s.length; i++) {
            if(s.charAt[i].equals(c)) {
                count++;
            }
        }
    }
    return count;
}
