public class SudokuSolver {

    // check if placing digit is safe
    static boolean isSafe(char[][] board, int row, int col, char dig) {

        // row + column check
        for (int i = 0; i < 9; i++) {
            if (board[row][i] == dig) return false;
            if (board[i][col] == dig) return false;
        }

        // 3x3 grid check
        int sr = (row / 3) * 3;
        int sc = (col / 3) * 3;

        for (int i = sr; i < sr + 3; i++) {
            for (int j = sc; j < sc + 3; j++) {
                if (board[i][j] == dig) return false;
            }
        }

        return true;
    }

    // backtracking solver
    static boolean solve(char[][] board) {

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {

                // find empty cell
                if (board[i][j] == '.') {

                    for (char dig = '1'; dig <= '9'; dig++) {
                        if (isSafe(board, i, j, dig)) {

                            board[i][j] = dig;

                            // recurse
                            if (solve(board)) {
                                return true;
                            }

                            // backtrack
                            board[i][j] = '.';
                        }
                    }

                    // no digit fits here
                    return false;
                }
            }
        }

        // no empty cell left -> solved
        return true;
    }

    // print board
    static void printBoard(char[][] board) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    // main method
    public static void main(String[] args) {

        char[][] board = {
            {'5','3','.','.','7','.','.','.','.'},
            {'6','.','.','1','9','5','.','.','.'},
            {'.','9','8','.','.','.','.','6','.'},

            {'8','.','.','.','6','.','.','.','3'},
            {'4','.','.','8','.','3','.','.','1'},
            {'7','.','.','.','2','.','.','.','6'},

            {'.','6','.','.','.','.','2','8','.'},
            {'.','.','.','4','1','9','.','.','5'},
            {'.','.','.','.','8','.','.','7','9'}
        };

        System.out.println("Original Sudoku:");
        printBoard(board);

        if (solve(board)) {
            System.out.println("\nSolved Sudoku:");
            printBoard(board);
        } else {
            System.out.println("No solution exists.");
        }
    }
}
