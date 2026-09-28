public class P06_HasWon {
    // board is a 3x3 tic-tac-toe board. Return true if player fills a whole row,
    // a whole column, or one of the two diagonals.
    public static boolean hasWon(char[][] board, char player) {
        boolean returnval = false;
        

        //check diagonals
        if(board[0][0] == player && board[2][2] == player && board[1][1] == player){
            returnval = true;
        }
        if(board[2][0] == player && board[0][2] == player && board[1][1] == player){
            returnval = true;
        }


        //check horizontals
        if(board[0][0] == player && board[0][1] == player && board[0][2] == player){
            returnval = true;
        }
        if(board[1][0] == player && board[1][1] == player && board[1][2] == player){
            returnval = true;
        }
        if(board[2][0] == player && board[2][1] == player && board[2][2] == player){
            returnval = true;
        }

        //check verticals
        if(board[0][0] == player && board[1][0] == player && board[2][0] == player){
            returnval = true;
        }
        if(board[0][1] == player && board[1][1] == player && board[2][1] == player){
            returnval = true;
        }

        if(board[0][2] == player && board[1][2] == player && board[2][2] == player){
            returnval = true;
        }


        return returnval;
    }
}
