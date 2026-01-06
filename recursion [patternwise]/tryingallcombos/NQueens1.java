import java.util.*;

public class NQueens1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of n: ");
        int n = sc.nextInt();

        List<List<String>> solutions = solveNQueens(n);

        System.out.println("\nTotal solutions: " + solutions.size());
        System.out.println();

        for (List<String> board : solutions) {
            for (String row : board) {
                System.out.println(row);
            }
            System.out.println();
        }

        sc.close();
    }

    public static List<List<String>> solveNQueens(int n) {
        List<List<String>> ans = new ArrayList<>();
        char board[][] = new char[n][n];

        // create empty board
        for (int i = 0; i < n; i++) {
            Arrays.fill(board[i], '.');
        }

        solve(ans, board, 0, n);
        return ans;
    }

    private static void solve(List<List<String>> ans, char board[][], int row, int n) {
        // base case
        if (row == n) {
            List<String> arr = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                arr.add(new String(board[i]));
            }
            ans.add(arr);
            return;
        }

        for (int col = 0; col < n; col++) {
            if (isSafe(row, col, n, board)) {
                board[row][col] = 'Q';
                solve(ans, board, row + 1, n);
                board[row][col] = '.'; // backtrack
            }
        }
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
