import java.util.*;

class Myarray {

    static ArrayList<Integer> transform(int arr[][]) {
        int n = arr.length;
        int m = arr[0].length;
        ArrayList<Integer> list = new ArrayList<>();

        int left = 0, right = m - 1;
        int top = 0, bottom = n - 1;

        while (top <= bottom && left <= right) {
            // left → right
            for (int i = left; i <= right; i++) {
                list.add(arr[top][i]);
            }
            top++;

            // top → bottom
            for (int i = top; i <= bottom; i++) {
                list.add(arr[i][right]);
            }
            right--;

            // right → left
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    list.add(arr[bottom][i]);
                }
                bottom--;
            }

            // bottom → top
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    list.add(arr[i][left]);
                }
                left++;
            }
        }
        return list;
    }
}

public class spiralmatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of matrix (rows n and columns m): ");
        int n = sc.nextInt();
        int m = sc.nextInt();

        int arr[][] = new int[n][m];
        System.out.println("Enter matrix elements row-wise: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        ArrayList<Integer> ans = Myarray.transform(arr);

        System.out.println("Spiral order traversal:");
        System.out.println(ans);

        sc.close();
    }
}
