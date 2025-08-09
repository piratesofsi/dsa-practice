import java.util.*;

class Myarray {

	static int size(int arr[], int target) {
		int length = 0;
		for (int i = 0; i < arr.length; i++) {
			int sum = 0;
			for (int j = i; j < arr.length; j++) {
				//it is same like the brute of n3 but in this we directly use only two
				//iteration so to make n2 as we used k to take a subarray but in the end we're
				//adding so only last element is added as we add an element and then check add an element an check
				//so each an every subarray too much work fewwww;
				sum += arr[j];


				if (sum == target) {
					length = Math.max(length, j - i + 1);


				}

			}
		}
		return length;
	}



	static void printarr(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(" " + arr[i]);
		}
	}
}



public class longestsubarraywithsumkbrute2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array : ");
		int n = sc.nextInt();
		int arr_1[] = new int[n];
		System.out.println("Enter the " + n + " elements of the array : ");
		for (int i = 0; i < arr_1.length; i++) {
			arr_1[i] = sc.nextInt();
		}
		System.out.println("Enter the value of k : ");
		int target = sc.nextInt();
		System.out.println("array entered by the user : ");
		Myarray.printarr(arr_1);
		System.out.println();
		int result = Myarray.size(arr_1, target);
		System.out.println("longest subarray with sum k is of length : " + result);
		sc.close();

	}
}