import java.util.*;
class Myarray {
	static int[] replace(int arr[], int n) {
		int positiveidx = 0;
		int negativeidx = 1;
		int temp[] = new int[n];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] >= 0) {
				temp[positiveidx] = arr[i];
				positiveidx += 2;
			} else {
				temp[negativeidx] = arr[i];
				negativeidx += 2;
			}
		}
		return temp;
	}

	static void printarr(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(" " + arr[i]);
		}
	}
}
public class rearrangingarraybysignoptimal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array : ");
		int n = sc.nextInt();
		int arr_1[] = new int[n];
		System.out.println("Enter the " + n + " elements of the array : ");
		for (int i = 0; i < arr_1.length; i++) {
			arr_1[i] = sc.nextInt();
		}
		System.out.println("Array entered by the user : ");
		Myarray.printarr(arr_1);
		System.out.println();
		Myarray.replace(arr_1, n);
		System.out.println("the rearranged array : ");
		int result[] = Myarray.replace(arr_1, n);
		Myarray.printarr(result);
		sc.close();
	}
}