public class P06_HasWon {
    // board is a 3x3 tic-tac-toe board. Return true if player fills a whole row,
    // a whole column, or one of the two diagonals.
    public static boolean hasWon(char[][] board, char player) {
        int n = 0;
        for (int i = 0; i < board.length; i++) {
            n = 0;
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == player) {
                    n++;
                }
                if (n == 3) {
                    return true;
                }
            }
        }

        for (int j = 0; j < board.length; j++) {
            n = 0;
            for (int i = 0; i < board.length; i++) {
                if (board[i][j] == player) {
                    n++;
                }
                if (n == 3) {
                    return true;
                }
            }
        }

        n = 0;
        for (int i = 0; i < board.length; i++) {
            if (board[i][i] == player) {
                n++;
            }
            if (n == 3) {
                return true;
            }
        }

        if (board[0][2] == player && board[1][1] == player && board[2][0] == player) {
            return true;
        }
        return false;
    }
}