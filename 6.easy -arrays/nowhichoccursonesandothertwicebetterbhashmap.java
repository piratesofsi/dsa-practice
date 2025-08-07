import java.util.*;

class Myarray {

	static void once(int arr[]) {
		HashMap<Long, Integer> h1 = new HashMap<>();
		//take input from the array to hashmap
		for (long i : arr) {
			h1.put(i, h1.getOrDefault(i, 0) + 1);
		}

		//find first element which occurs only once
		for (long i : arr) {
			if (h1.get(i) == 1) {
				System.out.println("the no occurs once is " + i);
				break;
			}
		}
	}



	static void printarr(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(" " + arr[i]);
		}
	}
}
public class nowhichoccursonesandothertwicebetterbhashmap {
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
		Myarray.once(arr_1);
		sc.close();
	}
}