public class P06_HasWon {

    // board is a 3x3 tic-tac-toe board. Return true if player fills a whole row,
    // a whole column, or one of the two diagonals.

    public static boolean hasWon(char[][] board, char player) {

        for (int row = 0; row < 3; row++) {
            if (board[row][0] == player &&
                board[row][1] == player &&
                board[row][2] == player) {
                return true;
            }
        }

        for (int col = 0; col < 3; col++) {
            if (board[0][col] == player &&
                board[1][col] == player &&
                board[2][col] == player) {
                return true;
            }
        }

        if (board[0][0] == player &&
            board[1][1] == player &&
            board[2][2] == player) {
            return true;
        }

        if (board[0][2] == player &&
            board[1][1] == player &&
            board[2][0] == player) {
            return true;
        }

        return false;
    }
}