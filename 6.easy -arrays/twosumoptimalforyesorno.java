import java.util.*;

class Myarray {

	static String sum(int arr[], int target) {

		int left = 0;
		int right = arr.length - 1;

		Arrays.sort(arr);
		while (left < right) {
			int sum = arr[left] + arr[right];
			if (sum < target) {
				left++;
			} else if (sum > target) {
				right--;
			} else {
				return "Yes";
			}


		}
		return "No";
	}


	static void printarr(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(" " + arr[i]);
		}
	}
}
public class twosumoptimalforyesorno {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array : ");
		int n = sc.nextInt();
		int arr_1[] = new int[n];
		System.out.println("Enter the " + n + " elements of the array : ");
		for (int i = 0; i < arr_1.length; i++) {
			arr_1[i] = sc.nextInt();
		}

		System.out.println("Enter the target : ");
		int k = sc.nextInt();
		System.out.println();
		System.out.println("array entered by the user : ");
		Myarray.printarr(arr_1);
		String result = Myarray.sum(arr_1, k);
		System.out.println();
		if (result == "Yes") {
			System.out.println("yes the pair exists ");
		} else {
			System.out.println("no the pair doesnt exists ");
		}
		sc.close();

	}
}