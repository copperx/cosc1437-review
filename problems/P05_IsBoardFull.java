public class P05_IsBoardFull {
    // A tic-tac-toe board holds 'X', 'O', or ' ' (empty). Return true if no cell is empty.
    public static boolean isBoardFull(char[][] board) {
        boolean returnval = true;;
        for(int row = 0; row < board.length; row++){
            for(int col = 0; col < board[row].length; col++){
                if(board[row][col] == ' '){
                    returnval = false;
                }
            }
        }
        return returnval;
    }
}
