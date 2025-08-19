import java.util.*;
class Myarray {
	static int maximize(int arr[]) {
		int maxlen = 1;
		int num = arr[0];
		Arrays.sort(arr);
		int count = 1;

		for (int i = 1; i < arr.length; i++) {



			if (arr[i] == num + 1) {
				num += 1;
				count++;
				maxlen = Math.max(maxlen, count);

			} else if (arr[i] != num + 1) {
				count = 1;
				num = arr[i];
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
public class findlongestconsecutivebetter {
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