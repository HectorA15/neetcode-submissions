class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        HashSet<Character>[] col = new HashSet[9];
        HashSet<Character>[] rows = new HashSet[9];
        HashSet<Character>[] squares = new HashSet[9];
        
        for (int i = 0; i < 9; i++) {
            rows[i] = new HashSet<>();
            col[i] = new HashSet<>(); 
            squares[i] = new HashSet<>();
        }

        for (int i = 0; i < board.length; i++ ){ // rows


            for(int j = 0; j< board[i].length; j++){ // columns
                 
                if (board[i][j] == '.') continue;
                int squareIndex = (i / 3) * 3 + (j / 3);    
                
                if (!rows[i].add(board[i][j]) ||
                    !col[j].add(board[i][j]) ||
                    !squares[squareIndex].add(board[i][j])) 
                    return false;
            }
        }  
        return true;

    }
}
