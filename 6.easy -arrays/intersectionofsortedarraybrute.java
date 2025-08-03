import java.util.*;


class Myarray {

	static ArrayList<Integer> intersection(int arr1[], int arr2[], int m, int n) {
		ArrayList<Integer> a1 = new ArrayList<>();
		int visitedarray[] = new int[n];
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if (arr1[i] == arr2[j] && visitedarray[j] == 0) {
					a1.add(arr1[i]);
					visitedarray[j] = 1;
					break;

				}
				if (arr2[j] > arr1[i])
					break;

			}
		}
		return a1;
	}




	static void printarr(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(" " + arr[i]);
		}
	}
}
public class intersectionofsortedarraybrute {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the first  array : ");
		int m = sc.nextInt();
		System.out.println("Enter the size of the second  array : ");
		int n = sc.nextInt();
		int arr_1[] = new int[m];
		int arr_2[] = new int[n];
		System.out.println("Enter the " + m + "elements of the first array : ");
		for (int i = 0; i < arr_1.length; i++) {
			arr_1[i] = sc.nextInt();
		}
		System.out.println("Enter the " + n + "elements of the first array : ");
		for (int i = 0; i < arr_2.length; i++) {
			arr_2[i] = sc.nextInt();
		}

		System.out.println("first array entered by the user : ");
		Myarray.printarr(arr_1);
		System.out.println("second array entered by the user : ");
		Myarray.printarr(arr_2);
		System.out.println();
		System.out.println("intersection array : ");
		ArrayList<Integer> result = Myarray.intersection(arr_1, arr_2, m, n);

		for (var i : result) {
			System.out.print(" " + i);
		}
		sc.close();


	}
}