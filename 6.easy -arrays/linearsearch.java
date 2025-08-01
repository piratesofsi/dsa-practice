import java.util.*;

class Myarray {


	static int  ls(int arr[], int target) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == target) {
				return i;
			}
		}
		return -1;
	}

	static void printarr(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(" " + arr[i]);
		}
	}
}
public class linearsearch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array : ");
		int n = sc.nextInt();

		int arr_1[] = new int[n];
		System.out.println("Enter the " + n + " of elements in the array : ");
		for (int i = 0; i < arr_1.length; i++) {
			arr_1[i] = sc.nextInt();
		}
		System.out.println("Enter the target : ");
		int k = sc.nextInt();


		System.out.println("array entered by the user : ");
		Myarray.printarr(arr_1);
		System.out.println();
		int result = Myarray.ls(arr_1, k);
		System.out.println("the target element is present at " + result + " index ");
		sc.close();


	}
}