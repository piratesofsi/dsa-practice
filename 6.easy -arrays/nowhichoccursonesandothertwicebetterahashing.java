import java.util.*;


class Myarray {

	static int once(int arr[]) {
		int maxi = 0;
		//step one finding maximum
		for (int i = 0; i < arr.length; i++) {
			maxi = Math.max(maxi, arr[i]);
		}
		//step two :making a hash array and hashing all the elements in the hash array from the array
		int hash[] = new int[maxi + 1];
		for (int i = 0; i < arr.length; i++) {
			hash[arr[i]]++;
		}

		//step three : finding the element which occurs only once
		for (int i = 0; i < maxi + 1; i++) {
			if (hash[i] == 1) {
				return i;
			}
		}


		return -1;
	}





	static void printarr(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(" " + arr[i]);
		}
	}
}
public class nowhichoccursonesandothertwicebetterahashing {
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