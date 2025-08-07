import java.util.*;

class Myarray {

	static int once(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			for (int j = 0; j < arr.length; j++) {
				if (arr[j] == arr[i]) {
					count++;
				}
			}
			if (count == 1)
				return arr[i];
		}
		return -1;

	}



	static void printarr(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(" " + arr[i]);
		}
	}
}
public class nowhichoccursonesandothertwicebrute {
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
		int result = Myarray.once(arr_1);
		System.out.println("the no which is occured only ones is : " + result);
		sc.close();


	}
}