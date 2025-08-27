import java.util.*;


class Myarray {

	static void swap(int arr[], int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	static void reversearow(int arr[]) {
		int i = 0; int j = arr.length - 1;
		while (i < j) {
			swap(arr, i++, j--);
		}

	}


	static void rotate(int arr[][]) {
		int n = arr.length;
		int m = arr[0].length;
		//transpose the matrix
		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < arr[0].length; j++) {
				int temp = arr[i][j];
				arr[i][j] = arr[j][i];
				arr[j][i] = temp;


			}
		}

		//reversing the each row
		for (int i = 0; i < arr.length; i++) {
			reversearow(arr[i]);
		}


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
public class rotatematrixby90optimal {
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
		Myarray.rotate(arr_1);
		Myarray.printarr(arr_1);
		sc.close();
	}
}