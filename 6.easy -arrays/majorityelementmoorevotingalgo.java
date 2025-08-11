import java.util.*;

class Myarray {

	static int zadakimajority(int arr[], int n) {
		//finding majority
		int candidate = -1;
		int count1 = 0;
		for (int i = 0; i < arr.length; i++) {
			if (count1 == 0) {
				candidate = arr[i];
				count1 = 1;
			} else if (arr[i] == candidate) {
				count1++;
			} else {
				count1--;
			}

		}
		//now the majority is found now check it like if it's greater then
		//>n/2
		int count2 = 0;
		for (int i = 0; i < arr.length; i++) {
			if (candidate == arr[i]) {
				count2++;
			}



		}
		if (count2 > n / 2) {
			return candidate;
		}
		return -1;

	}



	static void printarr(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(" " + arr[i]);
		}
	}

}



public class majorityelementmoorevotingalgo {
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
		int result = Myarray.zadakimajority(arr_1, n);
		System.out.println("majority element in the array : " + result);
		sc.close();
	}
}