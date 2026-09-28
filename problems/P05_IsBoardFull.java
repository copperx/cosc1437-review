public class P05_IsBoardFull {
    public static boolean isBoardFull(char[][] board) {
        for (char[] row : board) {
            for (char c : row) {
                if (c == ' ') {
                    return false;
                }
            }
        }
        return true;
    }
}
