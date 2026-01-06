import java.util.*;

public class NQueens2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of n: ");
        int n = sc.nextInt();

        int result = totalNQueens(n);
        System.out.println("\nTotal number of solutions: " + result);

        sc.close();
    }

    public static int totalNQueens(int n) {
        char board[][] = new char[n][n];

        // create empty board
        for (int i = 0; i < n; i++) {
            Arrays.fill(board[i], '.');
        }

        return solve(board, 0, n);
    }

    private static int solve(char board[][], int row, int n) {
        if (row == n) {
            return 1;
        }

        int count = 0;

        for (int col = 0; col < n; col++) {
            if (isSafe(row, col, n, board)) {
                board[row][col] = 'Q';
                count += solve(board, row + 1, n);
                board[row][col] = '.'; // backtrack
            }
        }
        return count;
    }

    private static boolean isSafe(int row, int col, int n, char board[][]) {

        // horizontal
        for (int i = 0; i < n; i++) {
            if (board[row][i] == 'Q')
                return false;
        }

        // vertical
        for (int i = 0; i < n; i++) {
            if (board[i][col] == 'Q')
                return false;
        }

        // left diagonal
        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q')
                return false;
        }

        // right diagonal
        for (int i = row, j = col; i >= 0 && j < n; i--, j++) {
            if (board[i][j] == 'Q')
                return false;
        }

        return true;
    }
}
