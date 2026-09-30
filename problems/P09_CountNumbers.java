public class P09_CountNumbers {
    // Return how many items Integer.parseInt can convert without an exception.
    // countNumbers({"12", "abc", "-5", "3.5"}) returns 2
    public static int countNumbers(String[] items) {
       int count = 0;
        while (scanner.hasNext()) {
            String word = scanner.next();
            try {
                Integer.parseInt(word);
                count++;
            } catch (NumberFormatException e) {
                // Not an integer, skip
            }
        }
        return count;
    
    }
}
