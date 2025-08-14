import java.util.*;

class Myarray {

	static int stocks(int arr[]) {
		int maxprofit = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				maxprofit = Math.max(maxprofit, arr[j] - arr[i]);

			}
		}

		return maxprofit;
	}


	static void printarr(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(" " + arr[i]);
		}
	}
}




public class buyandsellstocksbrute {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array : ");
		int n = sc.nextInt();
		int arr_1[] = new int[n];
		System.out.println("Enter " + n + " elements of the array : ");
		for (int i = 0; i < arr_1.length; i++) {
			arr_1[i] = sc.nextInt();
		}
		System.out.println("Array entered by the user : ");
		Myarray.printarr(arr_1);
		int result = Myarray.stocks(arr_1);
		System.out.println();
		System.out.println("the maxium profit can be attained is : " + result);
		sc.close();
	}
}