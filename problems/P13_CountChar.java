public class P13_CountChar {
    public static int countChar(String s, char c) {
        if (s.equals("")) {
            return 0;
        }
        int rest = countChar(s.substring(1), c);
        if (s.charAt(0) == c) {
            return rest + 1;
        }
        return rest;
    }
}
