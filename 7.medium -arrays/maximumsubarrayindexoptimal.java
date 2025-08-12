import java.util.*;
class Myarray {




	static int[] subarray(int arr[]) {
		int maximum = Integer.MIN_VALUE;
		int sum = 0;

		int start = 0;       // to track potential start index
		int arrstart = -1;   // final start index
		int arrend = -1;     // final end index

		for (int i = 0; i < arr.length; i++) {
			if (sum == 0) {
				start = i; // mark potential start
			}

			sum += arr[i];

			if (sum > maximum) {
				maximum = sum;
				arrstart = start;
				arrend = i;
			}

			if (sum < 0) {
				sum = 0; // reset sum if negative
			}
		}

		return new int[] {arrstart, arrend};
	}


	static void printarr(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(" " + arr[i]);
		}
	}
}
public class maximumsubarrayindexoptimal {
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
		int result[] = Myarray.subarray(arr_1);
		System.out.println("maximum subarray is found at index : ");
		Myarray.printarr(result);

		sc.close();

	}
}