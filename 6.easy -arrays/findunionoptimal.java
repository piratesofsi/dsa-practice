import java.util.*;


class Myarray {

	static ArrayList<Integer> union (int arr1[], int arr2[], int m, int n) {
		int i = 0;
		int j = 0;
		ArrayList<Integer> a1 = new ArrayList<>();
		while (i < m && j < n) {
			if (arr1[i] <= arr2[j]) {
				if (a1.size() == 0 || a1.get(a1.size() - 1) != arr1[i]) {
					a1.add(arr1[i]);

				}
				i++;
			} else {
				if (a1.size() == 0 || a1.get(a1.size() - 1) != arr2[j]) {
					a1.add(arr2[j]);

				}
				j++;

			}

		}

		while (i < m) {
			if (a1.size() == 0 || !a1.contains(arr1[i])) {
				a1.add(arr1[i]);
			}
			i++;

		}

		while (j < n) {
			if (a1.size() == 0 || !a1.contains(arr2[j])) {
				a1.add(arr2[j]);
			}
			j++;
		}
		return a1;
	}



	static void printarr(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(" " + arr[i]);
		}
	}
}
public class findunionoptimal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the first array : ");
		int m = sc.nextInt();
		System.out.println("Enter the size of the second  array : ");
		int n = sc.nextInt();
		int arr_1[] = new int[m];
		int arr_2[] = new int[n];
		System.out.println("enter the " + m + "elements of the first array : ");
		for (int i = 0; i < arr_1.length; i++) {
			arr_1[i] = sc.nextInt();
		}
		System.out.println("enter the " + n + "elements of the second array : ");
		for (int i = 0; i < arr_2.length; i++) {
			arr_2[i] = sc.nextInt();
		}


		System.out.println("array 1 entered by the user : ");
		Myarray.printarr(arr_1);
		System.out.println();
		System.out.println("array 2 entered by the user : ");
		Myarray.printarr(arr_2);
		System.out.println();
		System.out.println("the union of the both arrays is ");
		ArrayList<Integer> result = Myarray.union(arr_1, arr_2, m, n);
		for ( var i : result) {
			System.out.print(" " + i);
		}

		sc.close();
	}
}