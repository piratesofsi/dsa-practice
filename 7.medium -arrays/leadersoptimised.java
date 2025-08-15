import java.util.*;
class Myarray {
	static int[] top(int arr[], int n) {
		int max = arr[n - 1];
		List<Integer> l1 = new ArrayList<>();
		l1.add(arr[n - 1]);
		for (int i = n - 2; i >= 0; i--) {
			if (arr[i] >= max) {
				l1.add(arr[i]);
				max = arr[i];
			}

		}
		Collections.reverse(l1);
		int p = 0;
		int result[] = new int[l1.size()];
		for (int num : l1) {
			result[p++] = num;

		}
		return result;
	}
	static void printarr(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(" " + arr[i]);
		}
	}
}
public class leadersoptimised {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array : ");
		int n = sc.nextInt();
		int arr_1[] = new int[n];
		System.out.println("Enter the " + n + " elements of the array  : ");
		for (int i = 0; i < arr_1.length; i++) {
			arr_1[i] = sc.nextInt();
		}
		System.out.println("Array entered by the user : ");
		Myarray.printarr(arr_1);
		int result[] = Myarray.top(arr_1, n);
		System.out.println();
		System.out.println("leaders of the array is : ");
		Myarray.printarr(result);
		sc.close();


	}
}