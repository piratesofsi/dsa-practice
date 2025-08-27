import java.util.*;
class Myarray {

	static void transform(int arr[][], int n, int m) {
		int rows[] = new int[n];
		int cols[] = new int[m];
		//traverse and  mark zeroes in rows and cols
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				// if we found 0 then that row and col is marked
				if (arr[i][j] == 0) {
					rows[i] = 1;
					cols[j] = 1;
				}
			}
		}


		//check which rows and col is marked and make that row and
		//column zero
		for (int i = 0; i < n; i++) {

			for (int j = 0; j < m; j++) {
				if (rows[i] == 1 || cols[j] == 1) {
					arr[i][j] = 0;

				}
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
public class setmatrixtozerobetter {
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