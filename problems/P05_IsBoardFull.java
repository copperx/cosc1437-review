public class P05_IsBoardFull {
    // A tic-tac-toe board holds 'X', 'O', or ' ' (empty). Return true if no cell is empty.
   public static boolean isBoardFull(char[][] board) {
    for (int i = 0; i < board.length; i++) {
        for (int j = 0; j < board.length; j++) {
            if (board[i][j] == ' ') {
                return false;
            }
        }
    }
        return true;
    }
}
