import java.util.*;

class Myarray {
	static void swap(int arr[], int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	static void dutchsort(int arr[], int n) {
		int low = 0; int mid = 0; int high = n - 1;
		while (mid <= high) {
			if (arr[mid] == 0) {
				swap(arr, low , mid);
				low++;
				mid++;


			} else if (arr[mid] == 1) {
				mid++;

			} else {
				swap(arr, mid, high);
				high--;

			}
		}
	}



	static void printarr(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(" " + arr[i]);
		}
	}
}
public class dutchalgorithm012 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array : ");
		int n = sc.nextInt();
		int arr_1[] = new int[n];
		System.out.println("Enter the  " + n + " elements of the array : ");
		for (int i = 0; i < arr_1.length; i++) {
			arr_1[i] = sc.nextInt();
		}
		System.out.println("array entered by the user : ");
		Myarray.printarr(arr_1);
		Myarray.dutchsort(arr_1, n);
		System.out.println("sorted array : ");
		System.out.println();
		Myarray.printarr(arr_1);
		sc.close();
	}
}