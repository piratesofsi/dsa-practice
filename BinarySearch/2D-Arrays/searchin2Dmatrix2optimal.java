import java.util.Scanner;

public class searchin2Dmatrix2optimal {

    // Optimal staircase search
    public static boolean searchMatrix(int[][] matrix, int target) {
        // Early exit if target is outside matrix range
        if (target < matrix[0][0] || target > matrix[matrix.length - 1][matrix[0].length - 1])
            return false;

        int row = 0, col = matrix[0].length - 1;
        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] == target)
                return true;
            else if (target < matrix[row][col])
                col--;
            else
                row++;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input matrix size
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];

        // Input matrix elements
        System.out.println("Enter matrix elements (sorted row-wise and column-wise):");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Input target
        System.out.print("Enter target value: ");
        int target = sc.nextInt();

        // Search
        if (searchMatrix(matrix, target))
            System.out.println("Target found in matrix ✅");
        else
            System.out.println("Target not found in matrix ❌");

        sc.close();
    }
}
