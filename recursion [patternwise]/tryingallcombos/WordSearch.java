import java.util.*;

public class WordSearch {

    // Checks if the cell is valid and matches the character
    private static boolean isSafe(int i, int j, String word,
                                  boolean[][] visited,
                                  char[][] board,
                                  int k) {

        return (i >= 0 && i < board.length &&
                j >= 0 && j < board[0].length &&
                !visited[i][j] &&
                board[i][j] == word.charAt(k));
    }

    // DFS + Backtracking
    private static boolean helper(int row, int col,
                                  String word,
                                  boolean[][] visited,
                                  char[][] board,
                                  int k) {

        // Base case: matched full word
        if (k == word.length() - 1) {
            return true;
        }

        // Mark current cell visited
        visited[row][col] = true;

        // 4 directions
        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};

        for (int d = 0; d < 4; d++) {
            int newRow = row + dx[d];
            int newCol = col + dy[d];

            if (isSafe(newRow, newCol, word, visited, board, k + 1)) {
                if (helper(newRow, newCol, word, visited, board, k + 1)) {
                    return true;
                }
            }
        }

        // Backtrack
        visited[row][col] = false;
        return false;
    }

    // Main function same as LeetCode's exist()
    public static boolean exist(char[][] board, String word) {

        boolean[][] visited = new boolean[board.length][board[0].length];

        // Try every cell as starting point
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {

                if (isSafe(i, j, word, visited, board, 0)) {

                    if (helper(i, j, word, visited, board, 0)) {
                        return true;
                    }

                    // reset after failed attempt
                    visited[i][j] = false;
                }
            }
        }

        return false;
    }

    // Driver code
    public static void main(String[] args) {

        char[][] board = {
                {'A', 'B', 'C', 'E'},
                {'S', 'F', 'C', 'S'},
                {'A', 'D', 'E', 'E'}
        };

        String word1 = "ABCCED";
        String word2 = "SEE";
        String word3 = "ABCB";

        System.out.println("Word: " + word1 + " -> " + exist(board, word1));
        System.out.println("Word: " + word2 + " -> " + exist(board, word2));
        System.out.println("Word: " + word3 + " -> " + exist(board, word3));
    }
}
