public class P04_FindSeason {
    // Each row of table is {month, season}. Return the season of month, ignoring upper/lower case.
    // Return "not found" if month is not in the table.
    // findSeason({{"January", "Winter"}, {"July", "Summer"}}, "july") returns "Summer"
    public static String findSeason(String[][] table, String month) {
        for(int i = 0; i < a.length; i++) {
            for(int j = 0; j < a[i].length; i++) {
                String month = a[i + 1];
                String season = a[i][j];
                if(month.equalsIgnoreCase("January")) {
                    System.out.println(season);
                }
                else if(month.equalsIgnoreCase("February")) {
                    System.out.println(season);
                }
                else if(month.equalsIgnoreCase("March")) {
                    System.out.println(season);
                }
                else if(month.equalsIgnoreCase("April")) {
                    System.out.println(season);
                }
                else if(month.equalsIgnoreCase("May")) {
                    System.out.println(season);
                }
                else if(month.equalsIgnoreCase("June")) {
                    System.out.println(season);
                }
                else if(month.equalsIgnoreCase("July")) {
                    System.out.println(season);
                }
                else if(month.equalsIgnoreCase("August")) {
                    System.out.println(season);
                }
                else if(month.equalsIgnoreCase("September")) {
                    System.out.println(season);
                }
                else if(month.equalsIgnoreCase("October")) {
                    System.out.println(season);
                }
                else if(month.equalsIgnoreCase("November")) {
                    System.out.println(season);
                }
                else if(month.equalsIgnoreCase("December")) {
                    System.out.println(season);
                }
                else {
                    System.out.println("not found");
                }
            }
        }
        return season;
    }
}
