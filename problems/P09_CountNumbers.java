public class P09_CountNumbers {
    // Return how many items Integer.parseInt can convert without an exception.
    // countNumbers({"12", "abc", "-5", "3.5"}) returns 2
    public static int countNumbers(String[] items) {
        if (items == null) {
            return 0;
        }

        int count = 0;
        for (String item : items) {
            try {
                Integer.parseInt(item);
                count++;
            } catch (NumberFormatException e) {
              
            }
        }
        return count;
    }
}
