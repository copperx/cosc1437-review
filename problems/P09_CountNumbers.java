public class P09_CountNumbers {
    // Return how many items Integer.parseInt can convert without an exception.
    // countNumbers({"12", "abc", "-5", "3.5"}) returns 2
    public static int countNumbers(String[] items) {
        int times = items.length;

        for (int i = 0; i < items.length; i++) {
            try {
                Integer.parseInt(items[i]);
            }
            catch(NumberFormatException e) {
                times -= 1;
            }
        }


        
        return times;
        
    }
}
