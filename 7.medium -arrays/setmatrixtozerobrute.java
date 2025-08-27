import java.util.*;

class Myarray {
	//to mark row with -1
	static void markrow(int arr[][], int i, int n, int m) {
		for (int j = 0; j < n; j++) {
			if (arr[i][j] != 0) {
				arr[i][j] = -1;
			}

		}
	}

	//to markcoloumn with -1
	static void markcoloumn(int arr[][], int j, int n, int m) {
		for (int i = 0; i < n; i++) {
			if (arr[i][j] != 0) {
				arr[i][j] = -1;
			}

		}
	}


	//main method which traverse the matrix and wherver there's
	//zero then it marks that row and coloumn with 1 to -1
	static void transform(int arr[][], int n, int m) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (arr[i][j] == 0) {
					markrow(arr, i, n, m);
					markcoloumn(arr, j, n, m);
				}
			}
		}

		//replaces -1 to 0
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (arr[i][j] == -1) {
					arr[i][j] = 0;
				}
			}
		}
	}


	//traverse method

	static void printarr(int arr[][], int n, int m) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

	}
}
public class setmatrixtozerobrute {
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