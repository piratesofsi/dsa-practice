import java.util.*;
class Myarray {
	static void replace(int arr[], int n) {
		int positive[] = new int[n / 2];
		int negative[] = new int[n / 2];
		int p = 0;
		int k = 0;
		//taking negative into negative array and similarly for postive
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] >= 0) {
				positive[p++] = arr[i];

			} else {
				negative[k++] = arr[i];
			}
		}

		for (int i = 0; i < n / 2; i++) {
			arr[2 * i] = positive[i];
			arr[2 * i + 1] = negative[i];
		}


	}

	static void printarr(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(" " + arr[i]);
		}
	}
}
public class rearrangingarraybysignbrute {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array : ");
		int n = sc.nextInt();
		int arr_1[] = new int[n];
		System.out.println("Enter the " + n + " elements of the array : ");
		for (int i = 0; i < arr_1.length; i++) {
			arr_1[i] = sc.nextInt();
		}
		System.out.println("Array entered by the user : ");
		Myarray.printarr(arr_1);
		System.out.println();
		Myarray.replace(arr_1, n);
		System.out.println("the rearranged array : ");
		Myarray.printarr(arr_1);
		sc.close();
	}
}