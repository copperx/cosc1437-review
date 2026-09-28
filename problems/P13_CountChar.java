public class P13_CountChar {
    // Return how many times c appears in s.
    // countChar("banana", 'a') returns 3
    public static int countChar(String s, char c) {
        if(s.equals("")){
            return 0;
        }

        int count;

        if(s.charAt(0) == c){
            count = 1;
        } else {
            count = 0;
        }

        s = s.substring(1,s.length());

        return count + countChar(s, c);

    }
}
