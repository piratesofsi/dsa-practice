import java.util.*;

class Myarray {


	static void zero(int arr[], int n) {
		int temp[] = new int[n];
		int k = 0;
		//step 1:- remove all non zeroes elements from the array to temporary
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				temp[k++] = arr[i];
			}
		}

		//step 2
		for (int i = 0; i < arr.length; i++) {
			arr[i] = temp[i];
		}
	}



	static void printarr(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(" " + arr[i]);
		}
	}
}





public class movezeroestoendbrute {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array : ");
		int n = sc.nextInt();
		int arr_1[] = new int[n];
		System.out.println("Enter the " + n + "elements of the array : ");
		for (int i = 0; i < arr_1.length; i++) {
			arr_1[i] = sc.nextInt();
		}

		System.out.println("array entered by the user : ");
		Myarray.printarr(arr_1);
		System.out.println();
		Myarray.zero(arr_1, n);
		System.out.println("modified array : ");
		Myarray.printarr(arr_1);
		sc.close();

	}
}