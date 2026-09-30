public class P09_CountNumbers {
    public static int countNumbers(String[] items) {
        return helper(items, 0);
    }

    private static int helper(String[] items, int index) {
        if (items == null || index >= items.length) {
            return 0;
        }
        int current = 0;
        try {
            Integer.parseInt(items[index]);
            current = 1;
        } catch (NumberFormatException e) {
        }
        return current + helper(items, index + 1);
    }
}