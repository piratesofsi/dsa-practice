import java.util.*;

class  Myarray {

	static int subarray(int arr[], int k) {
		HashMap<Integer, Integer> m1 = new HashMap<>();
		m1.put(0, 1);
		int prefixsum = 0;
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			prefixsum += arr[i];
			int rem = prefixsum - k;
			if (m1.containsKey(rem)) {
				count += m1.getOrDefault(rem, 0);

			}
			m1.put(prefixsum, m1.getOrDefault(prefixsum, 0) + 1);
		}
		return count;
	}


	static void printarr(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(" " + arr[i]);
		}
	}
}
public class countmaximumsubarraywithkoptimal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array : ");
		int n = sc.nextInt();
		int arr_1[] = new int[n];
		for (int i = 0; i < arr_1.length; i++) {
			arr_1[i] = sc.nextInt();

		}
		System.out.println("Enter the target(k) : ");
		int target = sc.nextInt();
		System.out.println("Array entered by the user : ");
		Myarray.printarr(arr_1);
		System.out.println();
		System.out.println("We needed the sum of like is : " + target);
		System.out.println();
		int result = Myarray.subarray(arr_1, target);
		System.out.println("the no of subarray with count " + target + " is " + result);
		sc.close();

	}
}