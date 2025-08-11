import java.util.*;

class Myarray {
	static int zadakimajority(int arr[], int n) {
		HashMap<Integer, Integer> h1 = new HashMap<>();
		//now take all elements and their occurence in hashmap
		for (int i : arr) {
			h1.put(i, h1.getOrDefault(i, 0) + 1);
		}
		//check the occurence each and find which had >n/2
		for (int i : h1.keySet()) {
			if (h1.get(i) > n / 2) {
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


public class majorityelementhashingbetter {
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
		int result = Myarray.zadakimajority(arr_1, n);
		System.out.println("majority element in the array : " + result);
		sc.close();
	}
}