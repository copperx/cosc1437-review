public class P04_FindSeason {
    public static String findSeason(String[][] table, String month) {
        if (table == null || month == null) {
            return "not found";
        }
        for (String[] row : table) {
            if (row != null && row.length >= 2 && row[0] != null) {
                if (row[0].equalsIgnoreCase(month)) {
                    return row[1];
                }
            }
        }
        return "not found";
    }
}
