import java.util.*;

class Myarray {

	static void rotatearray(int arr[], int n) {
		int temp = arr[0];
		for (int i = 1; i < arr.length; i++) {
			arr[i - 1] = arr[i];
		}
		arr[n - 1] = temp;
	}





	static void printarr(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(" " + arr[i]);
		}
	}
}







public class leftrotatebyone {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array : ");
		int n = sc.nextInt();
		int arr_1[] = new int[n];
		System.out.println("Enter the " + n + " elements of the array : ");
		for (int i = 0; i < arr_1.length; i++) {
			arr_1[i] = sc.nextInt();
		}
		System.out.println("array entered by the user : ");
		Myarray.printarr(arr_1);
		System.out.println();
		System.out.println("array rotated by one in left direction : ");
		Myarray.rotatearray(arr_1, n);
		Myarray.printarr(arr_1);
		sc.close();

	}
}