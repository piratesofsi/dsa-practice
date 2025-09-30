import java.util.Scanner;

public class searchin2Dmatrixbrute {
    public static boolean searchMatrix(int[][] matrix, int target) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == target)
                    return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int m = sc.nextInt();

        int[][] matrix = new int[n][m];
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                matrix[i][j] = sc.nextInt();

        System.out.print("Enter target value: ");
        int target = sc.nextInt();

        boolean found = searchMatrix(matrix, target);
        System.out.println(found ? "Target found." : "Target not found.");
    }
}
