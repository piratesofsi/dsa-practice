import java.util.*;

class Myarray {

	static void swap(int arr[], int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	static void zero(int arr[]) {
		//step 1 - take i to 0
		int j = -1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				j = i;
				break;

			}
		}

		//step 2- i will be always a step ahead and will check zeroes and non-zeroes
		for (int i = j + 1; i < arr.length; i++) {
			if (arr[i] != 0) {
				swap(arr, i, j);
				j++;
			}


		}
	}





	static void printarr(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(" " + arr[i]);
		}
	}
}





public class movezeroestoendoptimal {
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
		Myarray.zero(arr_1);
		System.out.println("modified array : ");
		Myarray.printarr(arr_1);
		sc.close();

	}
}