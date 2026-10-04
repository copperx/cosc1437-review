public class P04_FindSeason {
    // Each row of table is {month, season}. Return the season of month, ignoring upper/lower case.
    // Return "not found" if month is not in the table.
    // findSeason({{"January", "Winter"}, {"July", "Summer"}}, "july") returns "Summer"
    public static String findSeason(String[][] table, String month) {
        String ans = "";
        for (int i = 0; i < table.length; i++) {
            if (month.equalsIgnoreCase(table[i][0])) {
                ans = table[i][1];
            }
        }
        if (ans.equals("")) {
            ans = "not found";
        }
        return ans;
    }
}
