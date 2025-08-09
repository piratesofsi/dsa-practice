import java.util.*;

class Myarray {

	static int size(int arr[], int target) {
		int i = 0;
		int j = 0;
		long sum = arr[0];
		int length = 0;
		int n = arr.length;
		while ( j < n) {
			if (i <= j && sum > target) {

				sum -= arr[i];
				i++;

			}
			if (sum == target) {
				length = Math.max(length, j - i + 1);
			}
			j++;
			if (j < n)
				sum += arr[j];
		}
		return length;
	}



	static void printarr(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(" " + arr[i]);
		}
	}
}


public class longestsubarraywithsumkoptimaltwopointer {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array : ");
		int n = sc.nextInt();
		int arr_1[] = new int[n];
		System.out.println("Enter the " + n + " elements of the array : ");
		for (int i = 0; i < arr_1.length; i++) {
			arr_1[i] = sc.nextInt();
		}
		System.out.println("Enter the value of k : ");
		int target = sc.nextInt();
		System.out.println("array entered by the user : ");
		Myarray.printarr(arr_1);
		System.out.println();
		int result = Myarray.size(arr_1, target);
		System.out.println("longest subarray with sum k is of length : " + result);
		sc.close();
	}
}