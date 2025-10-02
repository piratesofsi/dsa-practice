import java.util.*;

public class Findtherowwithmaximumnumberof1brute {
    
    public static int[] rowAndMaximumOnes(int[][] mat) {
        int m = mat[0].length;
        int index = -1;
        int count_Max = -1;

        for (int i = 0; i < mat.length; i++) {
            int count_Ones = m - lowerBound(mat[i], 1);
            if (count_Max < count_Ones) {
                count_Max = count_Ones;
                index = i;
            }
        }
        return new int[]{index, count_Max};
    }

    static int lowerBound(int[] arr, int target) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] >= target) return i;
        }
        return n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int m = sc.nextInt();

        int[][] mat = new int[n][m];
        System.out.println("Enter matrix elements (each row sorted):");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        int[] result = rowAndMaximumOnes(mat);
        System.out.println("Row with maximum ones: " + result[0]);
        System.out.println("Number of ones: " + result[1]);

        sc.close();
    }
}
