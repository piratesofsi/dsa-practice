import java.util.*;
class Myarray {
	static int maximize(int arr[]) {
		int maxlen = 1;

		HashSet<Integer> set = new HashSet<>();

		//hashset stores only unique element and it is unordered
		//iterate through array and take elements in hashset
		for (int i = 0; i < arr.length; i++) {
			set.add(arr[i]);
		}

		for (int it : set) {
			if (!set.contains(it - 1)) {
				int count = 1;
				int num = it;

				while (set.contains(num + 1)) {
					num += 1;
					count++;

				}
				maxlen = Math.max(maxlen, count);
			}
		}

		return maxlen;

	}



	static void printarr(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(" " + arr[i]);
		}
	}
}
public class findlongestconsecutiveoptimalhashset {
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
		int result = Myarray.maximize(arr_1);
		System.out.println("the length of the longest consecutive sequence is : " + result);
		sc.close();


	}
}