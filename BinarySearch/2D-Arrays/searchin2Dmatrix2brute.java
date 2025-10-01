import java.util.Scanner;

public class searchin2Dmatrix2brute {
    public static boolean searchMatrix(int[][] matrix, int target) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == target) return true;
            }
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
