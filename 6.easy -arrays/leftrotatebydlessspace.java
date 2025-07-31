import java.util.*;



class Myarray {
	static void swap(int arr[], int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	static void reverse(int arr[], int i, int j) {

		while (i < j) {
			swap(arr, i, j);
			i++;
			j--;


		}
	}

	static void rotatearray(int arr[], int d, int n) {
		reverse(arr, 0, d - 1);
		reverse(arr, d, n - 1);
		reverse(arr, 0, n - 1);


	}




	static void printarr(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(" " + arr[i]);
		}
	}

}







public class leftrotatebydlessspace {



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
		Myarray.rotatearray(arr_1, d, n );
		System.out.println("rotated array is ");
		Myarray.printarr(arr_1);
		sc.close();


	}
}