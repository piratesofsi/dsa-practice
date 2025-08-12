import java.util.*;
class Myarray {

	static int subarray(int arr[]) {
		int maximum = Integer.MIN_VALUE;
		int sum = 0;

		//iterate through the array

		for (int i = 0; i < arr.length; i++) {
			//first you'll assign the first element to sum

			sum += arr[i];
			//then compare it with maximum
			maximum = Math.max(sum, maximum);
			//then the sum if it is negative then define sum=0
			if (sum < 0) {
				sum = 0;
			}

		}
		if (maximum < 0) {
			return 0;
		}
		return maximum;
	}

	static void printarr(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(" " + arr[i]);
		}
	}
}
public class maximumsubarrayonlyoptimal {
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
		int result = Myarray.subarray(arr_1);
		System.out.println("the maximum subarray is of " + result);
		sc.close();

	}
}