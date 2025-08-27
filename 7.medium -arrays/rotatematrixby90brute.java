import java.util.*;


class Myarray {

	static int[][] rotate(int arr[][]) {
		int n = arr.length;
		int m = arr[0].length;
		int ans[][] = new int[n][m];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {

				ans[j][n - 1 - i] = arr[i][j];

			}
		}
		return ans;
	}




	static void printarr(int arr[][]) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
public class rotatematrixby90brute {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the matrix  i.e (rows)n and (columns)m : ");
		int n = sc.nextInt();
		int m = sc.nextInt();
		int arr_1[][] = new int[n][m];
		System.out.println("Enter the matrix elements : ");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				arr_1[i][j] = sc.nextInt();
			}
		}

		System.out.println("matrix entered by the user : ");
		Myarray.printarr(arr_1);

		System.out.println();

		System.out.println("rotated matrix is : ");
		int ans[][] = Myarray.rotate(arr_1);
		Myarray.printarr(ans);
		sc.close();
	}
}