public class P06_HasWon {
    // board is a 3x3 tic-tac-toe board. Return true if player fills a whole row,
    // a whole column, or one of the two diagonals.
    public static boolean hasWon(char[][] board, char player) {
    
        for (int i = 0; i < 3; i++) {
         
            if (board[i][0] == player && board[i][1] == player && board[i][2] == player) {
                return true;
            }
      
            if (board[0][i] == player && board[1][i] == player && board[2][i] == player) {
                return true;
            }
        }
      
        if (board[0][0] == player && board[1][1] == player && board[2][2] == player) {
            return true;
        }
      
        if (board[0][2] == player && board[1][1] == player && board[2][0] == player) {
            return true;
        }
        return false;
    }
}
