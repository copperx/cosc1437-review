public class P05_IsBoardFull {
    // A tic-tac-toe board holds 'X', 'O', or ' ' (empty). Return true if no cell is empty.
    public static boolean isBoardFull(char[][] board) {
        boolean ans = true;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == ' ') {
                    ans = false;
                }
            }
        }
        return ans;
    }
}