import java.util.*;
class Myarray {
	static void swap(int arr[], int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	static void replace(int arr[], int n) {
		int positiveidx = 0;
		int negativeidx = 1;
		while (positiveidx < n && negativeidx < n) {
			if (arr[positiveidx] >= 0) {
				positiveidx += 2;

			} else if (arr[negativeidx] < 0) {
				negativeidx += 2;
			} else {
				swap(arr, positiveidx, negativeidx);
				positiveidx += 2;
				negativeidx += 2;
			}
		}
	}
	static void printarr(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(" " + arr[i]);
		}
	}
}
public class rearrangingarraybysignoptimaltwopointermorespaceoptimised {
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
		Myarray.replace(arr_1, n);
		Myarray.printarr(arr_1);
		sc.close();
	}
}