import java.util.*;
class Myarray {

	static void transform(int arr[][], int n, int m) {
		//int rows[] = new int[n];-> arr[..][0]
		//int cols[] = new int[m];-> arr[0][..]
		//taking that column extra
		int col0 = 1;
		//traversing the matrix and marking
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (arr[i][j] == 0) {
					//mark the i-row
					arr[i][0] = 0;
					//mark the j-col
					if (j != 0)
						arr[0][j] = 0;
					else
						col0 = 0;

				}
			}
		}
		//now changing the inner elements by comparing
		//rows and cols
		for (int i = 1; i < n; i++) {
			for (int j = 1; j < m; j++) {
				if (arr[i][j] != 0) {
					//cols and rows
					if (arr[0][j] == 0 || arr[i][0] == 0 ) {
						arr[i][j] = 0;
					}
				}

			}
		}

		//now for the rows
		if (arr[0][0] == 0) {
			for (int j = 0; j < m; j++) {
				arr[0][j] = 0;
			}
		}

		//now for the cols
		if (col0 == 0) {
			for (int i = 0; i < n; i++) {
				arr[i][0] = 0;
			}
		}



	}



	static void printarr(int arr[][], int n, int m) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}

public class setmatrixtozerooptimal {
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
		Myarray.printarr(arr_1, n, m);

		System.out.println();
		Myarray.transform(arr_1, n, m);
		System.out.println("tranformed matrix : ");
		Myarray.printarr(arr_1, n, m);
		sc.close();
	}
}