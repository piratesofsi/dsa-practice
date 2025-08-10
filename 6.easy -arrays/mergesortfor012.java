import java.util.*;

class Myarray {

	static void merge(int arr[], int st, int mid , int end) {
		int i = st;
		int j = mid + 1;
		//creating an temporary to store elements while coming back
		//like merging back from bottom to top

		int temp[] = new int[end - st + 1];
		int k = 0;
		//two subarrays using subarray to sort them and store them
		//in temporary array
		while (i <= mid && j <= end) {
			if (arr[i] <= arr[j]) {
				temp[k++] = arr[i++];

			} else {
				temp[k++] = arr[j++];
			}
		}

		while (i <= mid) {
			temp[k++] = arr[i++];
		}


		while (j <= end) {
			temp[k++] = arr[j++];
		}

		//putting the elements correctly from the temporary to og
		//array
		for (int p = 0; p < k; p++) {
			arr[p + st] = temp[p];
		}

	}

	static void ms(int arr[], int st, int end ) {
		if (st < end) {
			int mid = st + (end - st) / 2;
			ms(arr, st, mid);
			ms(arr, mid + 1, end);
			merge(arr, st, mid, end);
		}
	}



	static void printarr(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(" " + arr[i]);
		}
	}
}




public class mergesortfor012 {
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
		Myarray.ms(arr_1, 0, n - 1);
		System.out.println("sorted array : ");
		Myarray.printarr(arr_1);
		sc.close();

	}
}