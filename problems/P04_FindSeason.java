public class P04_FindSeason {
    public static String findSeason(String[][] table, String month) {
        for (String[] row : table) {
            if (row[0].equalsIgnoreCase(month)) {
                return row[1];
            }
        }
        return "not found";
    }
}
