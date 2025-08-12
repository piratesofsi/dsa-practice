import java.util.*;
class Myarray {

	static int subarray(int arr[]) {
		int maximum = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			int sum = 0;

			for (int j = i; j < arr.length; j++) {
				sum += arr[j];
				maximum = Math.max(sum, maximum);

			}
		}
		return maximum;
	}

	static void printarr(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(" " + arr[i]);
		}
	}
}
public class maximumsubarrayonlybetter {
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