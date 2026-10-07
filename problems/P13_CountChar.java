public class P13_CountChar 
{
    // Return how many times c appears in s.
    // countChar("banana", 'a') returns 3
    public static int countChar(String s, char c) 
    {
        if (s.length() == 0) return 0;
        return (s.charAt(0) == c ? 1 : 0) + countChar(s.substring(1), c);
    }
}
