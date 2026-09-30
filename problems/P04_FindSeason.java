public class P04_FindSeason {
    // Each row of table is {month, season}. Return the season of month, ignoring upper/lower case.
    // Return "not found" if month is not in the table.
    // findSeason({{"January", "Winter"}, {"July", "Summer"}}, "july") returns "Summer"
    public static String findSeason(String[][] table, String month) {
        for (int i = 0; i < table.length; i++) {
            if (table[i][0].equalsIgnoreCase(month)) {
                return table[i][1];

            }
        }
        return "not found";
    }

}
