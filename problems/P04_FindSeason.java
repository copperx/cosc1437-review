public class P04_FindSeason {
    // Each row of table is {month, season}. Return the season of month, ignoring upper/lower case.
    // Return "not found" if month is not in the table.
    // findSeason({{"January", "Winter"}, {"July", "Summer"}}, "july") returns "Summer"
    public static String findSeason(String[][] table, String month) {
        for(int row = 0; row < table.length; row++){
            if(table[row][0].equalsIgnoreCase(month)){
                return table[row][1];
            }
        }
        return "not found";
}
}
