import java.util.*;


class Myarray {

	static void rotatearray(int arr[], int d, int n) {
		d = d % n;
		int temp[] = new int[n];
		//put elements temporarily in the temporary array
		for (int i = 0; i < d; i++) {
			temp[i] = arr[i];
		}

		//shifting the elements
		for (int i = d; i < n; i++) {
			arr[i - d] = arr[i];
		}
		int j = 0;
		//putting back the elements
		for (int i = n - d; i < n; i++) {
			arr[i] = temp[j++];

		}
	}




	static void printarr(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(" " + arr[i]);
		}
	}
}




public class leftrotatebyd {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array : ");
		int n = sc.nextInt();
		int arr_1[] = new int[n];
		System.out.println("Enter the " + n + "elements in the array : ");
		for (int i = 0; i < arr_1.length; i++) {
			arr_1[i] = sc.nextInt();
		}
		System.out.println("Enter the no of rotations : ");
		int d = sc.nextInt();

		System.out.println("array entered by the user : ");
		Myarray.printarr(arr_1);
		System.out.println();
		Myarray.rotatearray(arr_1, d, n);
		System.out.println("rotated array is ");
		Myarray.printarr(arr_1);
		sc.close();



	}
}