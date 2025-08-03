import java.util.*;


class Myarray {
	static ArrayList<Integer> union(int arr1[], int arr2[], int m, int n ) {
		//creating HashSet and taking input of both the arrays
		HashSet<Integer> s = new HashSet<>();
		ArrayList<Integer> union = new ArrayList<>();
		//input arr1 and arr2 in hashset
		for (int i = 0; i < m; i++) {
			s.add(arr1[i]);
		}

		for (int i = 0; i < n; i++) {
			s.add(arr2[i]);
		}

		//input the hashset elements in the ArrayList
		for (int i : s) {
			union.add(i);
		}

		return union;

	}

	static void printarr(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(" " + arr[i]);
		}
	}
}
public class findunionbrute {
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