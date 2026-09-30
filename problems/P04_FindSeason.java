public class P04_FindSeason {
    // Each row of table is {month, season}. Return the season of month, ignoring upper/lower case.
    // Return "not found" if month is not in the table.
    // findSeason({{"January", "Winter"}, {"July", "Summer"}}, "july") returns "Summer"
    public static String findSeason(String[][] table, String month) {
        if (month < 1 || month > 12) {
            throw new IllegalArgumentException("Month must be between 1 and 12");
        }
        if (month == 12 || month == 1 || month == 2) {
            return "Winter";
        } else if (month >= 3 && month <= 5) {
            return "Spring";
        } else if (month >= 6 && month <= 8) {
            return "Summer";
        } else {
            return "Fall";
        }
        }
        
    }

