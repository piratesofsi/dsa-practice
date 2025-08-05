import java.util.*;


class Myarray {
	static int consecutive(int arr[]) {
		int maximum = 0;
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 1) {
				count++;
				maximum = Math.max(maximum, count);
			} else {
				count = 0;
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
public class maximumconsecutiveoneonlyoptimised {
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
		int result = Myarray.consecutive(arr_1);
		System.out.println();

		System.out.println("consecutive no of 1s are : " + result);
		sc.close();

	}
}