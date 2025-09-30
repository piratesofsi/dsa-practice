import java.util.Scanner;

public class searchin2Dmatrixoptimal {
    static boolean binarySearch(int[][] arr, int target) {
        int n = arr.length;
        int m = arr[0].length;
        int low = 0, high = (n * m) - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int row = mid / m;
            int col = mid % m;

            if (arr[row][col] == target)
                return true;
            else if (target < arr[row][col])
                high = mid - 1;
            else
                low = mid + 1;
        }
        return false;
    }

    public static boolean searchMatrix(int[][] matrix, int target) {
        return binarySearch(matrix, target);
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
