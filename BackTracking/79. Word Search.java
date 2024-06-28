import java.util.HashSet;

class Solution {
    public boolean exist(char[][] board, String word) {
        int rows = board.length;
        int cols = board[0].length;
        HashSet<String> hs = new HashSet<>();
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (solve(board, word, i, j, 0, hs)) {
                    return true;
                }
            }
        }
        
        return false;
    }
    
    private boolean solve(char[][] board, String word, int r, int c, int index, HashSet<String> hs) {
        if (index == word.length()) {
            return true;
        }
        
        int rows = board.length;
        int cols = board[0].length;
        
        if (r < 0 || c < 0 || r >= rows || c >= cols || board[r][c] != word.charAt(index) || hs.contains(r + "," + c)) {
            return false;
        }
        
        hs.add(r + "," + c);
        
        boolean found = solve(board, word, r - 1, c, index + 1, hs) ||
                        solve(board, word, r + 1, c, index + 1, hs) ||
                        solve(board, word, r, c - 1, index + 1, hs) ||
                        solve(board, word, r, c + 1, index + 1, hs);
        
        hs.remove(r + "," + c);
        
        return found;
    }
}
