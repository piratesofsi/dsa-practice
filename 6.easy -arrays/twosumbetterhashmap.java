import java.util.*;

class Myarray {
	static int[] sum(int arr[], int target) {
		HashMap<Integer, Integer> h1 = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			int a = arr[i];
			int moreneeded = target - a;
			if (h1.containsKey(moreneeded)) {
				return new int[] { h1.get(moreneeded), i};
			}
			h1.put(arr[i], i);

		}
		return new int[] { -1, -1};
	}


	static void printarr(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(" " + arr[i]);
		}
	}
}



public class twosumbetterhashmap {
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
		int result[] = Myarray.sum(arr_1, k);
		System.out.println();
		System.out.println("the pair exists at index");
		Myarray.printarr(result);
		sc.close();
	}
}