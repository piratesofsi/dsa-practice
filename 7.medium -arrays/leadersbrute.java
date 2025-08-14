import java.util.*;
class Myarray {
	static int[] top(int arr[]) {
		List<Integer> l1 = new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			boolean flag = true;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] > arr[i]) {
					flag = false;
					break;
				}

			}
			if (flag == true) {
				l1.add(arr[i]);

			}
		}
		int k = 0;
		int result[] = new int[l1.size()];
		for (int num : l1) {
			result[k++] = num;

		}
		return result;
	}
	static void printarr(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(" " + arr[i]);
		}
	}
}
public class leadersbrute {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array : ");
		int n = sc.nextInt();
		int arr_1[] = new int[n];
		System.out.println("Enter the " + n + " elements of the array  : ");
		for (int i = 0; i < arr_1.length; i++) {
			arr_1[i] = sc.nextInt();
		}
		System.out.println("Array entered by the user : ");
		Myarray.printarr(arr_1);

	}
}