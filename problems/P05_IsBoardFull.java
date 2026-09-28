public class P05_IsBoardFull {
    // A tic-tac-toe board holds 'X', 'O', or ' ' (empty). Return true if no cell is empty.
    public static boolean isBoardFull(char[][] board) {
        for(char[] row : board){
            for(char cell : row){
                if(cell == ' ') {
                    return false;
                }
            }
        }
        return true;
    }
}
