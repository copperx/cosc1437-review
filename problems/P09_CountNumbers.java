public class P09_CountNumbers {
    public static int countNumbers(String[] items) {
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
